//package hayaa.worker.service.core;
//
//import hayaa.basemodel.model.FunctionListResult;
//import hayaa.basemodel.model.FunctionOpenResult;
//import hayaa.basemodel.model.FunctionResult;
//import hayaa.basemodel.model.GridPager.GridPager;
//import hayaa.basemodel.model.GridPager.GridPagerPamater;
//import hayaa.worker.service.PersonService;
//import hayaa.worker.service.model.Person;
//import hayaa.worker.service.model.PersonSearchPamater;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service("pPersonService")
//public class PersonServer implements PersonService {
//    @Override
//    public FunctionResult<Person> Create(Person info) {
//        FunctionResult<Person> r = new FunctionResult<Person>();
//        info = PersonDal.add(info);
//        if (info.getPersonId() > 0) {
//            r.setData(info);
//        }
//        return r;
//    }
//
//    @Override
//    public FunctionOpenResult<Boolean> UpdateByID(Person info) {
//        FunctionOpenResult<Boolean> r = new FunctionOpenResult<Boolean>();
//        r.setData(PersonDal.Update(info));
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
//    public GridPager<Person> GetPager(GridPagerPamater<PersonSearchPamater> gridPagerPamater) {
//        GridPager<Person> r = PersonDal.GetGridPager(gridPagerPamater);
//        return r;
//    }
//
//    @Override
//    public FunctionResult<Person> Get(int id) {
//        FunctionResult<Person> r = new FunctionResult<Person>();
//        r.setData(PersonDal.Get(id));
//        return r;
//    }
//
//    @Override
//    public FunctionListResult<Person> GetList(PersonSearchPamater searchPamater) {
//        FunctionListResult<Person> r = new FunctionListResult<Person>();
//        r.setData(PersonDal.GetList(searchPamater));
//        return r;
//    }
//}