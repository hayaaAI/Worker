package hayaa.worker.service;

import hayaa.basemodel.model.FunctionListResult;
import hayaa.basemodel.model.FunctionOpenResult;
import hayaa.basemodel.model.FunctionResult;
import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.model.GridPager.GridPagerPamater;
import hayaa.worker.service.model.Company;
import hayaa.worker.service.model.CompanySearchPamater;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServer implements CompanyService {
    @Override
    public FunctionResult<Company> Create(Company info) {
        FunctionResult<Company> r=new FunctionResult<Company>();
        info=CompanyDal.add(info);
        if(info.getCompanyId()>0){
            r.setData(info);
        }
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> UpdateByID(Company info) {
        FunctionOpenResult<Boolean> r=new FunctionOpenResult<Boolean>();
        r.setData(CompanyDal.Update(info));
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> DeleteByID(List<Integer> list) {
        FunctionOpenResult<Boolean> r=new FunctionOpenResult<Boolean>();
        r.setData(CompanyDal.Delete(list));
        return r;
    }

    @Override
    public GridPager<Company> GetPager(GridPagerPamater<CompanySearchPamater> gridPagerPamater) {
        GridPager<Company> r=CompanyDal.GetGridPager(gridPagerPamater);
        return r;
    }

    @Override
    public FunctionResult<Company> Get(int id) {
        FunctionResult<Company> r=new FunctionResult<Company>();
        r.setData(CompanyDal.Get(id));
        return r;
    }

    @Override
    public FunctionListResult<Company> GetList(CompanySearchPamater companySearchPamater) {
        FunctionListResult<Company> r=new FunctionListResult<Company>();
        r.setData(CompanyDal.GetList(companySearchPamater));
        return r;
    }
}
