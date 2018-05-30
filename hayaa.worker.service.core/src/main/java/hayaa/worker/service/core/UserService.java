package hayaa.worker.service.core;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import hayaa.basemodel.model.FunctionListResult;
import hayaa.basemodel.model.FunctionOpenResult;
import hayaa.basemodel.model.FunctionResult;
import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.model.GridPager.GridPagerPamater;
import hayaa.basemodel.model.PamaterOperationType;
import hayaa.worker.service.IUserService;
import hayaa.worker.service.model.User;
import hayaa.worker.service.model.UserSearchPamater;
import hayaa.worker.service.model.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public FunctionResult<User> Create(User info) {
        FunctionResult<User> r = new FunctionResult<User>();
        userMapper.insert(info);
        if (info.getUserId() > 0) {
            r.setData(info);
        }
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> UpdateByID(User info) {
        FunctionOpenResult<Boolean> r = new FunctionOpenResult<Boolean>();
        r.setData(userMapper.update(info));
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> DeleteByID(List<Integer> list) {
        FunctionOpenResult<Boolean> r = new FunctionOpenResult<Boolean>();
        String ids = list.toString().replace("[", "").replace("]", "");
        r.setData(userMapper.delete(ids));
        return r;
    }

    @Override
    public GridPager<User> GetPager(GridPagerPamater<UserSearchPamater> gridPagerPamater) {
        PageHelper.orderBy("UserId desc");
        Page pageInfo = PageHelper.startPage(gridPagerPamater.getCurrent(), gridPagerPamater.getPageSize());
        String whereSql = gridPagerPamater.getSearchPamater().CreateWhereSql();
        List<User> dalResult = userMapper.getList(whereSql);
        GridPager<User> r = new GridPager<>(gridPagerPamater.getCurrent(), gridPagerPamater.getPageSize());
        r.setData(dalResult);
        r.setTotal((int) pageInfo.getTotal());
        return r;
    }

    @Override
    public FunctionResult<User> Get(int id) {
        FunctionResult<User> r = new FunctionResult<User>();
        r.setData(userMapper.get(id));
        return r;
    }

    @Override
    public FunctionListResult<User> GetList(UserSearchPamater searchPamater) {
        FunctionListResult<User> r = new FunctionListResult<User>();
        r.setData(userMapper.getList(searchPamater.CreateWhereSql()));
        return r;
    }

    @Override
    public GridPager<UserView> GetPager(int page, int size, String nickName) {
        PageHelper.orderBy("u.UserId desc");
        Page pageInfo = PageHelper.startPage(page,size);
        List<UserView> dalResult = userMapper.getViewList(nickName);
        GridPager<UserView> r = new GridPager<>(page, size);
        r.setData(dalResult);
        r.setTotal((int) pageInfo.getTotal());
        return r;
    }
}