package hayaa.worker.servicecontroller;


import hayaa.basemodel.model.FunctionOpenResult;
import hayaa.basemodel.model.FunctionResult;
import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.model.GridPager.GridPagerPamater;
import hayaa.basemodel.model.TransactionResult;
import hayaa.worker.service.CompanyService;
import hayaa.worker.service.model.Company;
import hayaa.worker.service.model.CompanySearchPamater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/company/", method = {RequestMethod.GET, RequestMethod.POST})
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "pager")
    public TransactionResult<GridPager<Company>> GetPager(int page, int size) {
        TransactionResult<GridPager<Company>> result = new TransactionResult<GridPager<Company>>();
        GridPagerPamater<CompanySearchPamater> pamater = new GridPagerPamater<>();
        GridPager<Company> serviceReusult = companyService.GetPager(pamater);
        if (serviceReusult.isActionResult() && serviceReusult.isHavingData()) {
            result.setData(serviceReusult);
        } else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "get")
    public TransactionResult<Company> Get(int id) {
        TransactionResult<Company> result = new TransactionResult<Company>();
        FunctionResult<Company> serviceResult = companyService.Get(id);
        if(serviceResult.isActionResult()&&serviceResult.isHavingData()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "add")
    public TransactionResult<Company> Add(Company info) {
        TransactionResult<Company> result = new TransactionResult<Company>();
        FunctionResult<Company> serviceResult = companyService.Create(info);
        if(serviceResult.isActionResult()&&serviceResult.isHavingData()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @RequestMapping(value = "edit")
    public TransactionResult<Boolean> Edit(Company info) {
        TransactionResult<Boolean> result = new TransactionResult<Boolean>();
        FunctionOpenResult<Boolean> serviceResult = companyService.UpdateByID(info);
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
        FunctionOpenResult<Boolean> serviceResult = companyService.DeleteByID(ids);
        if(serviceResult.isActionResult()){
            result.setData(serviceResult.getData());
        }else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
}
