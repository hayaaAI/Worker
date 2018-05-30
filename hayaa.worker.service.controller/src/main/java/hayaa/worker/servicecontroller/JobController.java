package hayaa.worker.servicecontroller;


import hayaa.basemodel.model.FunctionListResult;
import hayaa.basemodel.model.FunctionOpenResult;
import hayaa.basemodel.model.FunctionResult;
import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.model.GridPager.GridPagerPamater;
import hayaa.basemodel.model.TransactionResult;
import hayaa.worker.service.IJobService;
import hayaa.worker.service.model.Job;
import hayaa.worker.service.model.JobSearchPamater;
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
@RequestMapping(value = "/job/", method = {RequestMethod.GET, RequestMethod.POST})
@CrossOrigin(origins = "*",allowCredentials="true")
public class JobController {

    @Autowired
    private IJobService jobService;

    @RequestMapping(value = "pager")
    public TransactionResult<GridPager<Job>> GetPager(int page, int size, Integer departmentId) {
        TransactionResult<GridPager<Job>> result = new TransactionResult<GridPager<Job>>();
        GridPagerPamater<JobSearchPamater> pamater = new GridPagerPamater<>();
        JobSearchPamater dsp=  new JobSearchPamater();
        dsp.setDepartmentId(departmentId);
        pamater.setSearchPamater(dsp);
        pamater.setCurrent(page);
        pamater.setPageSize(size);
        GridPager<Job> serviceReusult = jobService.GetPager(pamater);
        if (serviceReusult.isActionResult() && serviceReusult.isHavingData()) {
            result.setData(serviceReusult);
        } else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "get")
    public TransactionResult<Job> Get(int id) {
        TransactionResult<Job> result = new TransactionResult<Job>();
        FunctionResult<Job> serviceResult = jobService.Get(id);
        if(serviceResult.isActionResult()&&serviceResult.isHavingData()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "list")
    public TransactionResult<List<Job>> getList(Integer departmentId) {
        TransactionResult<List<Job>> result = new TransactionResult<List<Job>>();
        JobSearchPamater jsp=new JobSearchPamater();
        jsp.setDepartmentId(departmentId);
        FunctionListResult<Job> serviceResult = jobService.GetList(jsp);
        if(serviceResult.isActionResult()&&serviceResult.isHavingData()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "set")
    public TransactionResult<Boolean> Set(int companyId,int departmentId,int jobId,int userId) {
        TransactionResult<Boolean> result = new TransactionResult<Boolean>();
        FunctionOpenResult<Boolean> serviceResult = jobService.set(companyId,departmentId,jobId,userId);
        if(serviceResult.isActionResult()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "add")
    public TransactionResult<Job> Add(Job info) {
        TransactionResult<Job> result = new TransactionResult<Job>();
        FunctionResult<Job> serviceResult = jobService.Create(info);
        if(serviceResult.isActionResult()&&serviceResult.isHavingData()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "edit")
    public TransactionResult<Boolean> Edit(Job info) {
        TransactionResult<Boolean> result = new TransactionResult<Boolean>();
        FunctionOpenResult<Boolean> serviceResult = jobService.UpdateByID(info);
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
        FunctionOpenResult<Boolean> serviceResult = jobService.DeleteByID(ids);
        if(serviceResult.isActionResult()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
}
