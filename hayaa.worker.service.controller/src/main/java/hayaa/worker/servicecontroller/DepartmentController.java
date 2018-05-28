//package hayaa.worker.servicecontroller;
//
//
//import hayaa.basemodel.model.FunctionOpenResult;
//import hayaa.basemodel.model.FunctionResult;
//import hayaa.basemodel.model.GridPager.GridPager;
//import hayaa.basemodel.model.GridPager.GridPagerPamater;
//import hayaa.basemodel.model.TransactionResult;
//import hayaa.worker.service.DepartmentService;
//import hayaa.worker.service.model.Department;
//import hayaa.worker.service.model.DepartmentSearchPamater;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@EnableAutoConfiguration
//@RequestMapping(value = "/department/", method = {RequestMethod.GET, RequestMethod.POST})
//public class DepartmentController {
//
//    @Autowired
//    private DepartmentService service;
//
//    @RequestMapping(value = "pager")
//    public TransactionResult<GridPager<Department>> GetPager(int page, int size) {
//        TransactionResult<GridPager<Department>> result = new TransactionResult<GridPager<Department>>();
//        GridPagerPamater<DepartmentSearchPamater> pamater = new GridPagerPamater<>();
//        pamater.setSearchPamater(new DepartmentSearchPamater());
//        GridPager<Department> serviceReusult = service.GetPager(pamater);
//        if (serviceReusult.isActionResult() && serviceReusult.isHavingData()) {
//            result.setData(serviceReusult);
//        } else {
//            result.setCode(103);
//            result.setMessage("暂无数据");
//        }
//        return result;
//    }
//    @RequestMapping(value = "get")
//    public TransactionResult<Department> Get(int id) {
//        TransactionResult<Department> result = new TransactionResult<Department>();
//        FunctionResult<Department> serviceResult = service.Get(id);
//        if(serviceResult.isActionResult()&&serviceResult.isHavingData()){
//            result.setData(serviceResult.getData());
//        }else {
//            result.setCode(103);
//            result.setMessage("暂无数据");
//        }
//        return result;
//    }
//    @RequestMapping(value = "add")
//    public TransactionResult<Department> Add(Department info) {
//        TransactionResult<Department> result = new TransactionResult<Department>();
//        FunctionResult<Department> serviceResult = service.Create(info);
//        if(serviceResult.isActionResult()&&serviceResult.isHavingData()){
//            result.setData(serviceResult.getData());
//        }else {
//            result.setCode(103);
//            result.setMessage("暂无数据");
//        }
//        return result;
//    }
//    @RequestMapping(value = "edit")
//    public TransactionResult<Boolean> Edit(Department info) {
//        TransactionResult<Boolean> result = new TransactionResult<Boolean>();
//        FunctionOpenResult<Boolean> serviceResult = service.UpdateByID(info);
//        if(serviceResult.isActionResult()){
//            result.setData(serviceResult.getData());
//        }else {
//            result.setCode(103);
//            result.setMessage("暂无数据");
//        }
//        return result;
//    }
//    @RequestMapping(value = "del")
//    public TransactionResult<Boolean> Delete(int id) {
//        TransactionResult<Boolean> result = new TransactionResult<Boolean>();
//        List<Integer> ids=new ArrayList<>();
//        ids.add(id);
//        FunctionOpenResult<Boolean> serviceResult = service.DeleteByID(ids);
//        if(serviceResult.isActionResult()){
//            result.setData(serviceResult.getData());
//        }else {
//            result.setCode(103);
//            result.setMessage("暂无数据");
//        }
//        return result;
//    }
//}
