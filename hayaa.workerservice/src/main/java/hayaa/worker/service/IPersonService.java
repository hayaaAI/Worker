package hayaa.worker.service;

import hayaa.basemodel.model.FunctionListResult;
import hayaa.basemodel.service.IBaseService;
import hayaa.worker.service.model.Person;
import hayaa.worker.service.model.PersonSearchPamater;

public interface IPersonService extends IBaseService<Person, PersonSearchPamater> {
    FunctionListResult<Person> GetListByDepartmentId(int departmentId);
}
