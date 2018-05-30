package hayaa.worker.service;

import hayaa.basemodel.model.FunctionOpenResult;
import hayaa.basemodel.service.IBaseService;
import hayaa.worker.service.model.Job;
import hayaa.worker.service.model.JobSearchPamater;

public interface IJobService extends IBaseService<Job, JobSearchPamater> {
    FunctionOpenResult<Boolean> set(int companyId, int departmentId, int jobId,int userId);
}
