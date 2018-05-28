package hayaa.worker.service.core;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import hayaa.basemodel.model.FunctionListResult;
import hayaa.basemodel.model.FunctionOpenResult;
import hayaa.basemodel.model.FunctionResult;
import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.model.GridPager.GridPagerPamater;
import hayaa.worker.service.IDepartmentService;
import hayaa.worker.service.model.Department;
import hayaa.worker.service.model.DepartmentSearchPamater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentService")
public class DepartmentService implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public FunctionResult<Department> Create(Department info) {
        FunctionResult<Department> r = new FunctionResult<Department>();
        departmentMapper.insert(info);
        if (info.getDepartmentId() > 0) {
            r.setData(info);
        }
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> UpdateByID(Department info) {
        FunctionOpenResult<Boolean> r = new FunctionOpenResult<Boolean>();
        r.setData(departmentMapper.update(info));
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> DeleteByID(List<Integer> list) {
        FunctionOpenResult<Boolean> r = new FunctionOpenResult<Boolean>();
        String ids = list.toString().replace("[", "").replace("]", "");
        r.setData(departmentMapper.delete(ids));
        return r;
    }

    @Override
    public GridPager<Department> GetPager(GridPagerPamater<DepartmentSearchPamater> gridPagerPamater) {
        PageHelper.orderBy("DepartmentId desc");
        Page pageInfo = PageHelper.startPage(gridPagerPamater.getCurrent(), gridPagerPamater.getPageSize());
        String whereSql = gridPagerPamater.getSearchPamater().CreateWhereSql();
        List<Department> dalResult = departmentMapper.getList(whereSql);
        GridPager<Department> r = new GridPager<>(gridPagerPamater.getCurrent(), gridPagerPamater.getPageSize());
        r.setData(dalResult);
        r.setTotal((int) pageInfo.getTotal());
        return r;
    }

    @Override
    public FunctionResult<Department> Get(int id) {
        FunctionResult<Department> r = new FunctionResult<Department>();
        r.setData(departmentMapper.get(id));
        return r;
    }

    @Override
    public FunctionListResult<Department> GetList(DepartmentSearchPamater searchPamater) {
        FunctionListResult<Department> r = new FunctionListResult<Department>();
        r.setData(departmentMapper.getList(searchPamater.CreateWhereSql()));
        return r;
    }
}