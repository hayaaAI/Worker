package hayaa.worker.servicecontroller;

import hayaa.basemodel.model.FunctionOpenResult;
import hayaa.basemodel.model.FunctionResult;
import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.model.GridPager.GridPagerPamater;
import hayaa.basemodel.model.TransactionResult;
import hayaa.worker.service.core.PersonService;
import hayaa.worker.service.core.UserService;
import hayaa.worker.service.model.Person;
import hayaa.worker.service.model.User;
import hayaa.worker.service.model.UserSearchPamater;
import hayaa.worker.service.model.UserView;
import hayaa.worker.servicecontroller.model.UserExtend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/user/", method = {RequestMethod.GET, RequestMethod.POST})
@CrossOrigin(origins = "*",allowCredentials="true")
public class UserController {
    @Autowired
    private PersonService personService;
    @Autowired
    private UserService userService;
    @RequestMapping(value = "pager")
    public TransactionResult<GridPager<UserView>> GetPager(int page, int size,String nickName) {
        TransactionResult<GridPager<UserView>> result = new TransactionResult<GridPager<UserView>>();

        GridPager<UserView> serviceReusult = userService.GetPager(page,size,nickName);
        if (serviceReusult.isActionResult() && serviceReusult.isHavingData()) {
            result.setData(serviceReusult);
        } else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "get")
    public TransactionResult<User> Get(int id) {
        TransactionResult<User> result = new TransactionResult<User>();
        FunctionResult<User> serviceResult = userService.Get(id);
        if(serviceResult.isActionResult()&&serviceResult.isHavingData()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "add")
    public TransactionResult<UserExtend> Add(UserExtend info) {
        TransactionResult<UserExtend> result = new TransactionResult<UserExtend>();
        //插入person
        Person person=new Person();
        person.setAi(info.getAi());
        person.setBirthday(info.getBirthday());
        person.setId(info.getId());
        person.setName(info.getName());
        person.setSex(info.getSex());
        FunctionResult<Person> personResult= personService.Create(person);
        if(!(personResult.isActionResult()&&personResult.isHavingData())){
            result.setCode(103);
            result.setMessage("person插入失败");
            return result;
        }
        info.setPersonId(person.getPersonId());
        //插入user
        User user=new User();
        user.setNickName(info.getNickName());
        user.setPersonGroup(info.getPersonGroup());
        user.setPersonId(person.getPersonId());
        user.setPhoto(info.getPhoto());
        FunctionResult<User> userResult= userService.Create(user);
        if(!(userResult.isActionResult()&&userResult.isHavingData())){
            result.setCode(103);
            result.setMessage("user插入失败");
            return result;
        }
        info.setUserId(user.getUserId());
        result.setData(info);
        return result;
    }
    @RequestMapping(value = "edit")
    public TransactionResult<Boolean> Edit(User info) {
        TransactionResult<Boolean> result = new TransactionResult<Boolean>();
        FunctionOpenResult<Boolean> serviceResult = userService.UpdateByID(info);
        if(serviceResult.isActionResult()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "del")
    public TransactionResult<Boolean> Delete(int id) {
        TransactionResult<Boolean> result = new TransactionResult<Boolean>();
        List<Integer> ids=new ArrayList<>();
        ids.add(id);
        FunctionOpenResult<Boolean> serviceResult = userService.DeleteByID(ids);
        if(serviceResult.isActionResult()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
}
