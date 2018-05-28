//package hayaa.worker.service.core;
//
//import hayaa.basemodel.model.FunctionListResult;
//import hayaa.basemodel.model.FunctionOpenResult;
//import hayaa.basemodel.model.FunctionResult;
//import hayaa.basemodel.model.GridPager.GridPager;
//import hayaa.basemodel.model.GridPager.GridPagerPamater;
//import hayaa.worker.service.DepartmentService;
//import hayaa.worker.service.model.Department;
//import hayaa.worker.service.model.DepartmentSearchPamater;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service("departmentService")
//public class DepartmentServer implements DepartmentService {
//    @Override
//    public FunctionResult<Department> Create(Department info) {
//        FunctionResult<Department> r = new FunctionResult<Department>();
//        info = DepartmentDal.add(info);
//        if (info.getDepartmentId() > 0) {
//            r.setData(info);
//        }
//        return r;
//    }
//
//    @Override
//    public FunctionOpenResult<Boolean> UpdateByID(Department info) {
//        FunctionOpenResult<Boolean> r = new FunctionOpenResult<Boolean>();
//        r.setData(DepartmentDal.Update(info));
//        return r;
//    }
//
//    @Override
//    public FunctionOpenResult<Boolean> DeleteByID(List<Integer> list) {
//        FunctionOpenResult<Boolean> r = new FunctionOpenResult<Boolean>();
//        r.setData(CompanyDal.Delete(list));
//        return r;
//    }
//
//    @Override
//    public GridPager<Department> GetPager(GridPagerPamater<DepartmentSearchPamater> gridPagerPamater) {
//        GridPager<Department> r = DepartmentDal.GetGridPager(gridPagerPamater);
//        return r;
//    }
//
//    @Override
//    public FunctionResult<Department> Get(int id) {
//        FunctionResult<Department> r = new FunctionResult<Department>();
//        r.setData(DepartmentDal.Get(id));
//        return r;
//    }
//
//    @Override
//    public FunctionListResult<Department> GetList(DepartmentSearchPamater searchPamater) {
//        FunctionListResult<Department> r = new FunctionListResult<Department>();
//        r.setData(DepartmentDal.GetList(searchPamater));
//        return r;
//    }
//}