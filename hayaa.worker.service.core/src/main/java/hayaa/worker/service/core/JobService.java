package hayaa.worker.service.core;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import hayaa.basemodel.model.FunctionListResult;
import hayaa.basemodel.model.FunctionOpenResult;
import hayaa.basemodel.model.FunctionResult;
import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.model.GridPager.GridPagerPamater;
import hayaa.worker.service.IJobService;
import hayaa.worker.service.model.Job;
import hayaa.worker.service.model.JobSearchPamater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jobService")
public class JobService implements IJobService {
    @Autowired
    private JobMapper jobMapper;

    @Override
    public FunctionResult<Job> Create(Job info) {
        FunctionResult<Job> r = new FunctionResult<Job>();
        jobMapper.insert(info);
        if (info.getJobId() > 0) {
            r.setData(info);
        }
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> UpdateByID(Job info) {
        FunctionOpenResult<Boolean> r = new FunctionOpenResult<Boolean>();
        r.setData(jobMapper.update(info));
        return r;
    }

    @Override
    public FunctionOpenResult<Boolean> DeleteByID(List<Integer> list) {
        FunctionOpenResult<Boolean> r = new FunctionOpenResult<Boolean>();
        String ids = list.toString().replace("[", "").replace("]", "");
        r.setData(jobMapper.delete(ids));
        return r;
    }

    @Override
    public GridPager<Job> GetPager(GridPagerPamater<JobSearchPamater> gridPagerPamater) {
        PageHelper.orderBy("JobId desc");
        Page pageInfo = PageHelper.startPage(gridPagerPamater.getCurrent(), gridPagerPamater.getPageSize());
        String whereSql = gridPagerPamater.getSearchPamater().CreateWhereSql();
        List<Job> dalResult = jobMapper.getList(whereSql);
        GridPager<Job> r = new GridPager<>(gridPagerPamater.getCurrent(), gridPagerPamater.getPageSize());
        r.setData(dalResult);
        r.setTotal((int) pageInfo.getTotal());
        return r;
    }

    @Override
    public FunctionResult<Job> Get(int id) {
        FunctionResult<Job> r = new FunctionResult<Job>();
        r.setData(jobMapper.get(id));
        return r;
    }

    @Override
    public FunctionListResult<Job> GetList(JobSearchPamater searchPamater) {
        FunctionListResult<Job> r = new FunctionListResult<Job>();
        r.setData(jobMapper.getList(searchPamater.CreateWhereSql()));
        return r;
    }
}