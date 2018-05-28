//package hayaa.worker.service.core;
//
//import hayaa.basemodel.model.GridPager.GridPager;
//import hayaa.basemodel.model.GridPager.GridPagerPamater;
//import hayaa.basemodel.model.MariadbConfig;
//import hayaa.dataaccess.CommonDal;
//import hayaa.dataaccess.DbUtilsConfig;
//import hayaa.worker.service.model.Person;
//import hayaa.worker.service.model.PersonSearchPamater;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class PersonDal {
//    private static CommonDal commonDal = null;
//
//    static {
//        MariadbConfig mariadbConfig = ConfigHelper.getInstance().getDBConfig(DefineTable.DatabaseName);
//        DbUtilsConfig config = new DbUtilsConfig();
//        config.setUrl(mariadbConfig.getUrl());
//        config.setDbUserName(mariadbConfig.getDbUserName());
//        config.setDbUserPwd(mariadbConfig.getDbUserPwd());
//        config.setDefaultAutoCommit(mariadbConfig.getDefaultAutoCommit());
//        config.setDriverClass(mariadbConfig.getDriverClass());
//        config.setMaxIdle(mariadbConfig.getMaxIdle());
//        try {
//            commonDal = new CommonDal(config);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    static Person add(Person info) {
//        String sql = "insert into Person(Name,Sex,Birthday,ID,IsAI) values(:Name,:Sex,:Birthday,:ID,:IsAI);";
//        return commonDal.insert(sql, info, Person.class);
//    }
//
//    static Boolean Update(Person info) {
//        String sql = "update Person set Name=:Name,Sex=:Sex,Birthday=:Birthday,ID=:ID,IsAI=:IsAI where PersonId=:PersonId";
//        return commonDal.update(sql, info);
//    }
//
//    static Boolean Delete(List<Integer> IDs) {
//        List<String> ids = new ArrayList<>();
//        IDs.forEach(id -> {
//            ids.add("?");
//        });
//        String sql = "delete from  Person where PersonId in (" + String.join(",", ids) + ")";
//        return commonDal.excute(sql, IDs) > 0;
//    }
//
//    static Person Get(int Id) {
//        String sql = "select * from Person  where PersonId=?";
//        return commonDal.get(sql, Id, Person.class);
//    }
//
//    static List<Person> GetList(PersonSearchPamater pamater) {
//        String sql = "select * from Person " + pamater.CreateWhereSql();
//        return commonDal.getList(sql, pamater, Person.class);
//    }
//
//    static GridPager GetGridPager(GridPagerPamater<PersonSearchPamater> pamater) {
//        String sql = "select SQL_CALC_FOUND_ROWS * from Person " + pamater.getSearchPamater().CreateWhereSql() + " limit :start,:pageSize;select FOUND_ROWS();";
//        pamater.getSearchPamater().setStart((pamater.getCurrent() - 1) * pamater.getPageSize());
//        pamater.getSearchPamater().setPageSize(pamater.getPageSize());
//        return commonDal.getGridPager(sql, pamater.getPageSize(), pamater.getCurrent(), pamater, Person.class);
//    }
//}