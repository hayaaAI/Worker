package hayaa.worker.service.core;

import org.apache.ibatis.annotations.*;

@Mapper
interface Rel_Company_Department_Job_UserMapper {
    @Insert("insert into Rel_Company_Department_Job_User(CompanyId,DepartmentId,JobId,UserId,Status) " +
            "values(#{info.CompanyId},#{info.DepartmentId},#{info.JobId},#{info.UserId},1);")
    @Options(useGeneratedKeys = true, keyProperty = "info.Id")
    void insert(@Param("info") Rel_Company_Department_Job_User info);

    @Update("update Rel_Company_Department_Job_User set Id=#{rel_Company_Department_Job_User.Id},CompanyId=#{rel_Company_Department_Job_User.CompanyId},DepartmentId=#{rel_Company_Department_Job_User.DepartmentId},JobId=#{rel_Company_Department_Job_User.JobId},UserId=#{rel_Company_Department_Job_User.UserId},Status=#{rel_Company_Department_Job_User.Status} where Rel_Company_Department_Job_UserId=#{rel_Company_Department_Job_User.Rel_Company_Department_Job_UserId}")
    Boolean update(@Param("rel_Company_Department_Job_User") Rel_Company_Department_Job_User rel_Company_Department_Job_User);

    @Delete("delete from Rel_Company_Department_Job_User where rel_Company_Department_Job_UserId in (${ids})")
    Boolean delete(@Param("ids") String ids);
    @Delete("delete from Rel_Company_Department_Job_User where userId=#{userId}")
    Boolean deleteByUserId(@Param("userId") Integer userId);

    @Select("select * from Rel_Company_Department_Job_User where Rel_Company_Department_Job_UserId =#{Id}")
    Rel_Company_Department_Job_User get(int Id);

}