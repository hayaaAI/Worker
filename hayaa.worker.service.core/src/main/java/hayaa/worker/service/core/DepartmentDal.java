//package hayaa.worker.service.core;
//
//import hayaa.basemodel.model.GridPager.GridPager;
//import hayaa.basemodel.model.GridPager.GridPagerPamater;
//import hayaa.basemodel.model.MariadbConfig;
//import hayaa.dataaccess.CommonDal;
//import hayaa.dataaccess.DbUtilsConfig;
//import hayaa.worker.service.model.Department;
//import hayaa.worker.service.model.DepartmentSearchPamater;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class DepartmentDal {
//    private static CommonDal commonDal = null;
//
//   static {
//        MariadbConfig mariadbConfig = ConfigHelper.getInstance().getDBConfig(DefineTable.DatabaseName);
//        DbUtilsConfig config = new DbUtilsConfig();
//        config.setUrl(mariadbConfig.getUrl());
//        config.setDbUserName(mariadbConfig.getDbUserName());
//        config.setDbUserPwd(mariadbConfig.getDbUserPwd());
//        config.setDefaultAutoCommit(mariadbConfig.getDefaultAutoCommit());
//        config.setDriverClass(mariadbConfig.getDriverClass());
//        config.setMaxIdle(mariadbConfig.getMaxIdle());
//       try {
//           commonDal = new CommonDal(config);
//       } catch (Exception e) {
//           e.printStackTrace();
//       }
//   }
//
//    static Department add(Department info) {
//        String sql = "insert into Department(Name,Title,Remark,Birdthday) values(:Name,:Title,:Remark,:Birdthday);";
//        return commonDal.insert(sql, info, Department.class);
//    }
//
//    static Boolean Update(Department info) {
//        String sql = "update Department set Name=:Name,Title=:Title,Remark=:Remark,Birdthday=:Birdthday where DepartmentId=:DepartmentId";
//        return commonDal.update(sql, info);
//    }
//
//    static Boolean Delete(List<Integer> IDs) {
//        List<String> ids = new ArrayList<>();
//        IDs.forEach(id -> {
//            ids.add("?");
//        });
//        String sql = "delete from  Department where DepartmentId in (" + String.join(",", ids) + ")";
//        return commonDal.excute(sql, IDs) > 0;
//    }
//
//    static Department Get(int Id) {
//        String sql = "select * from Department  where DepartmentId=?";
//        return commonDal.get(sql, Id, Department.class);
//    }
//
//    static List<Department> GetList(DepartmentSearchPamater pamater) {
//        String sql = "select * from Department " + pamater.CreateWhereSql();
//        return commonDal.getList(sql, pamater, Department.class);
//    }
//
//    static GridPager GetGridPager(GridPagerPamater<DepartmentSearchPamater> pamater) {
//        String sql = "select SQL_CALC_FOUND_ROWS * from Department " + pamater.getSearchPamater().CreateWhereSql() + " limit :start,:pageSize;select FOUND_ROWS();";
//        pamater.getSearchPamater().setStart((pamater.getCurrent() - 1) * pamater.getPageSize());
//        pamater.getSearchPamater().setPageSize(pamater.getPageSize());
//        return commonDal.getGridPager(sql, pamater.getPageSize(), pamater.getCurrent(), pamater, Department.class);
//    }
//}