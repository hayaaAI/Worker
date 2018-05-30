package hayaa.worker.servicecontroller;


import hayaa.basemodel.model.FunctionListResult;
import hayaa.basemodel.model.FunctionOpenResult;
import hayaa.basemodel.model.FunctionResult;
import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.model.GridPager.GridPagerPamater;
import hayaa.basemodel.model.TransactionResult;
import hayaa.worker.service.IPersonService;
import hayaa.worker.service.model.Person;
import hayaa.worker.service.model.PersonSearchPamater;
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
@RequestMapping(value = "/person/", method = {RequestMethod.GET, RequestMethod.POST})
@CrossOrigin(origins = "*",allowCredentials="true")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @RequestMapping(value = "pager")
    public TransactionResult<GridPager<Person>> GetPager(int page, int size) {
        TransactionResult<GridPager<Person>> result = new TransactionResult<GridPager<Person>>();
        GridPagerPamater<PersonSearchPamater> pamater = new GridPagerPamater<>();
        pamater.setSearchPamater(new PersonSearchPamater());
        GridPager<Person> serviceReusult = personService.GetPager(pamater);
        if (serviceReusult.isActionResult() && serviceReusult.isHavingData()) {
            result.setData(serviceReusult);
        } else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "get")
    public TransactionResult<Person> Get(int id) {
        TransactionResult<Person> result = new TransactionResult<Person>();
        FunctionResult<Person> serviceResult = personService.Get(id);
        if(serviceResult.isActionResult()&&serviceResult.isHavingData()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "list")
    public TransactionResult<List<Person>> GetList(int departmentId) {
        TransactionResult<List<Person>> result = new TransactionResult<List<Person>>();
        FunctionListResult<Person> serviceResult = personService.GetListByDepartmentId(departmentId);
        if(serviceResult.isActionResult()&&serviceResult.isHavingData()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "add")
    public TransactionResult<Person> Add(Person info) {
        TransactionResult<Person> result = new TransactionResult<Person>();
        FunctionResult<Person> serviceResult = personService.Create(info);
        if(serviceResult.isActionResult()&&serviceResult.isHavingData()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "edit")
    public TransactionResult<Boolean> Edit(Person info) {
        TransactionResult<Boolean> result = new TransactionResult<Boolean>();
        FunctionOpenResult<Boolean> serviceResult = personService.UpdateByID(info);
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
        FunctionOpenResult<Boolean> serviceResult = personService.DeleteByID(ids);
        if(serviceResult.isActionResult()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
}
