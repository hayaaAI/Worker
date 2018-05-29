package hayaa.worker.service.core;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import hayaa.basemodel.model.FunctionListResult;
import hayaa.basemodel.model.FunctionOpenResult;
import hayaa.basemodel.model.FunctionResult;
import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.model.GridPager.GridPagerPamater;
import hayaa.worker.service.IPersonService;
import hayaa.worker.service.model.Person;
import hayaa.worker.service.model.PersonSearchPamater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personService")
public class PersonService implements IPersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public FunctionResult<Person> Create(Person info) {
        FunctionResult<Person> r = new FunctionResult<Person>();
        personMapper.insert(info);
        if (info.getPersonId() > 0) {
            r.setData(info);
        }
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> UpdateByID(Person info) {
        FunctionOpenResult<Boolean> r = new FunctionOpenResult<Boolean>();
        r.setData(personMapper.update(info));
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> DeleteByID(List<Integer> list) {
        FunctionOpenResult<Boolean> r = new FunctionOpenResult<Boolean>();
        String ids = list.toString().replace("[", "").replace("]", "");
        r.setData(personMapper.delete(ids));
        return r;
    }

    @Override
    public GridPager<Person> GetPager(GridPagerPamater<PersonSearchPamater> gridPagerPamater) {
        PageHelper.orderBy("PersonId desc");
        Page pageInfo = PageHelper.startPage(gridPagerPamater.getCurrent(), gridPagerPamater.getPageSize());
        String whereSql = gridPagerPamater.getSearchPamater().CreateWhereSql();
        List<Person> dalResult = personMapper.getList(whereSql);
        GridPager<Person> r = new GridPager<>(gridPagerPamater.getCurrent(), gridPagerPamater.getPageSize());
        r.setData(dalResult);
        r.setTotal((int) pageInfo.getTotal());
        return r;
    }

    @Override
    public FunctionResult<Person> Get(int id) {
        FunctionResult<Person> r = new FunctionResult<Person>();
        r.setData(personMapper.get(id));
        return r;
    }

    @Override
    public FunctionListResult<Person> GetList(PersonSearchPamater searchPamater) {
        FunctionListResult<Person> r = new FunctionListResult<Person>();
        r.setData(personMapper.getList(searchPamater.CreateWhereSql()));
        return r;
    }
    @Override
    public FunctionListResult<Person> GetListByDepartmentId(int departmentId) {
        FunctionListResult<Person> r = new FunctionListResult<Person>();
        r.setData(personMapper.getListByDepartmentId(departmentId));
        return r;
    }
}