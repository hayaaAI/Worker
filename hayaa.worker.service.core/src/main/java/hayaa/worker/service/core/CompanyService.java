package hayaa.worker.service.core;

import hayaa.basemodel.model.FunctionListResult;
import hayaa.basemodel.model.FunctionOpenResult;
import hayaa.basemodel.model.FunctionResult;
import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.model.GridPager.GridPagerPamater;
import hayaa.worker.service.ICompanyService;
import hayaa.worker.service.model.Company;
import hayaa.worker.service.model.CompanySearchPamater;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompanyService implements ICompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public FunctionResult<Company> Create(Company info) {
        FunctionResult<Company> r=new FunctionResult<Company>();
        companyMapper.insert(info);
        if(info.getCompanyId()>0){
            r.setData(info);
        }
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> UpdateByID(Company info) {
        FunctionOpenResult<Boolean> r=new FunctionOpenResult<Boolean>();
        r.setData(companyMapper.update(info));
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> DeleteByID(List<Integer> list) {
        FunctionOpenResult<Boolean> r=new FunctionOpenResult<Boolean>();
        String ids=list.toString().replace("[","").replace("]","");
        r.setData(companyMapper.delete(ids));
        return r;
    }

    @Override
    public GridPager<Company> GetPager(GridPagerPamater<CompanySearchPamater> gridPagerPamater) {
        GridPager<Company> r=null;//companyMapper.GetGridPager(gridPagerPamater);
        return r;
    }

    @Override
    public FunctionResult<Company> Get(int id) {
        FunctionResult<Company> r=new FunctionResult<Company>();
        r.setData(companyMapper.get(id));
        return r;
    }

    @Override
    public FunctionListResult<Company> GetList(CompanySearchPamater companySearchPamater) {
        FunctionListResult<Company> r=new FunctionListResult<Company>();
       // r.setData(companyMapper.GetList(companySearchPamater));
        return r;
    }
}
