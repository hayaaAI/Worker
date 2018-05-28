//package hayaa.worker.service.core;
//
//import hayaa.basemodel.model.GridPager.GridPager;
//import hayaa.basemodel.model.GridPager.GridPagerPamater;
//import hayaa.basemodel.model.MariadbConfig;
//import hayaa.dataaccess.CommonDal;
//import hayaa.dataaccess.DbUtilsConfig;
//import hayaa.worker.service.model.Company;
//import hayaa.worker.service.model.CompanySearchPamater;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class CompanyDal  {
//    private static CommonDal commonDal=null;
//    static {
//        MariadbConfig mariadbConfig=ConfigHelper.getInstance().getDBConfig(DefineTable.DatabaseName);
//        DbUtilsConfig config=new DbUtilsConfig();
//        config.setUrl(mariadbConfig.getUrl());
//        config.setDbUserName(mariadbConfig.getDbUserName());
//        config.setDbUserPwd(mariadbConfig.getDbUserPwd());
//        config.setDefaultAutoCommit(mariadbConfig.getDefaultAutoCommit());
//        config.setDriverClass(mariadbConfig.getDriverClass());
//        config.setMaxIdle(mariadbConfig.getMaxIdle());
//        try {
//            commonDal=new CommonDal(config);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    static Company add(Company info){
//        String sql = "insert into Company(companyCode,companyFullName,companyName,birdthday) " +
//                "
// .";
//        return commonDal.insert(sql, info,Company.class);
//    }
//     static Boolean Update(Company info)
//    {
//        String sql = "update Company set companyCode=:companyCode,companyFullName=:companyFullName,companyName=:companyName,birdthday=:birdthday " +
//                "where companyId=:companyId";
//        return commonDal.update(sql, info);
//    }
//     static Boolean Delete(List<Integer> IDs)
//    {
//        List<String> ids=new ArrayList<>();
//        IDs.forEach(id->{
//            ids.add("?");
//        });
//        String sql = "delete from  Company where companyId in ("+String.join(",",ids)+")";
//        return commonDal.excute(sql, IDs) > 0;
//    }
//     static Company Get(int Id)
//    {
//        String sql = "select * from Company  where companyId=:Id";
//        return commonDal.get(sql, Id,Company.class);
//    }
//    static List<Company> GetList(CompanySearchPamater pamater)
//    {
//        String sql = "select * from Company " + pamater.CreateWhereSql();
//        return commonDal.getList(sql, pamater,Company.class);
//    }
//    static GridPager GetGridPager(GridPagerPamater<CompanySearchPamater> pamater)
//    {
//        String sql = "select SQL_CALC_FOUND_ROWS * from Company " + pamater.getSearchPamater().CreateWhereSql()
//                + " limit ?start,?pageSize;select FOUND_ROWS();";
//        pamater.getSearchPamater().setStart((pamater.getCurrent() - 1) * pamater.getPageSize());
//        pamater.getSearchPamater().setPageSize(pamater.getPageSize());
//        return commonDal.getGridPager(sql, pamater.getPageSize(), pamater.getCurrent(), pamater,Company.class);
//    }
//}
