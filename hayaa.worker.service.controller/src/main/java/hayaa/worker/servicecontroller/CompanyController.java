package hayaa.worker.servicecontroller;


import hayaa.basemodel.model.*;
import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.model.GridPager.GridPagerPamater;
import hayaa.common.AssertHelper;
import hayaa.worker.service.ICompanyService;
import hayaa.worker.service.model.Company;
import hayaa.worker.service.model.CompanySearchPamater;
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
@RequestMapping(value = "/company/", method = {RequestMethod.GET, RequestMethod.POST})
@CrossOrigin(origins = "*", allowCredentials = "true")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    @ServiceDescDocment(name = "pager", title = "公司数据分页", remark = "")
    @RequestMapping(value = "pager")
    public TransactionResult<GridPager<Company>> GetPager(int page, int size) {
        TransactionResult<GridPager<Company>> result = new TransactionResult<GridPager<Company>>();
        GridPagerPamater<CompanySearchPamater> pamater = new GridPagerPamater<>();
        CompanySearchPamater csp = new CompanySearchPamater();
        pamater.setSearchPamater(csp);
        pamater.setCurrent(page);
        pamater.setPageSize(size);
        GridPager<Company> serviceReusult = companyService.GetPager(pamater);
        if (serviceReusult.isActionResult() && serviceReusult.isHavingData()) {
            result.setData(serviceReusult);
        } else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @ServiceDescDocment(name = "get", title = "获取单个公司数据", remark = "")
    @RequestMapping(value = "get")
    public TransactionResult<Company> Get(int id) throws Exception {
        AssertHelper.AssertRangInt(id, 1, Integer.MAX_VALUE);
        TransactionResult<Company> result = new TransactionResult<Company>();
        FunctionResult<Company> serviceResult = companyService.Get(id);
        if (serviceResult.isActionResult() && serviceResult.isHavingData()) {
            result.setData(serviceResult.getData());
        } else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @ServiceDescDocment(name = "list", title = "获取公司数据列表", remark = "")
    @RequestMapping(value = "list")
    public TransactionResult<List<Company>> getList() {
        TransactionResult<List<Company>> result = new TransactionResult<List<Company>>();
        FunctionListResult<Company> serviceResult = companyService.GetList(new CompanySearchPamater());
        if (serviceResult.isActionResult() && serviceResult.isHavingData()) {
            result.setData(serviceResult.getData());
        } else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @ServiceDescDocment(name = "add", title = "添加公司数据", remark = "")
    @RequestMapping(value = "add")
    public TransactionResult<Company> Add(Company info) {
        TransactionResult<Company> result = new TransactionResult<Company>();
        FunctionResult<Company> serviceResult = companyService.Create(info);
        if (serviceResult.isActionResult() && serviceResult.isHavingData()) {
            result.setData(serviceResult.getData());
        } else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @ServiceDescDocment(name = "edit", title = "编辑公司数据", remark = "")
    @RequestMapping(value = "edit")
    public TransactionResult<Boolean> Edit(Company info) {
        TransactionResult<Boolean> result = new TransactionResult<Boolean>();
        FunctionOpenResult<Boolean> serviceResult = companyService.UpdateByID(info);
        if (serviceResult.isActionResult()) {
            result.setData(serviceResult.getData());
        } else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
    @ServiceDescDocment(name = "del", title = "删除公司数据", remark = "")
    @RequestMapping(value = "del")
    public TransactionResult<Boolean> Delete(int id) {
        TransactionResult<Boolean> result = new TransactionResult<Boolean>();
        List<Integer> ids = new ArrayList<>();
        ids.add(id);
        FunctionOpenResult<Boolean> serviceResult = companyService.DeleteByID(ids);
        if (serviceResult.isActionResult()) {
            result.setData(serviceResult.getData());
        } else {
            result.setCode(103);
            result.setMessage("暂无数据");
        }
        return result;
    }
}
