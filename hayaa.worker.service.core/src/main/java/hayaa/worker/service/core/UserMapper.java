package hayaa.worker.service.core;

import hayaa.worker.service.model.User;
import hayaa.worker.service.model.UserView;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
interface UserMapper {
    @Insert("insert into User(NickName,PersonId,PersonGroup,Photo) values(#{user.NickName},#{user.PersonId},#{user.PersonGroup},#{user.Photo});")
    @Options(useGeneratedKeys = true, keyProperty = "user.UserId")
    void insert(@Param("user") User user);

    @Update("update User set NickName=#{user.NickName},PersonId=#{user.PersonId},PersonGroup=#{user.PersonGroup},Photo=#{user.Photo} where UserId=#{user.UserId}")
    Boolean update(@Param("user") User user);

    @Delete("delete from User where userId in (${ids})")
    Boolean delete(@Param("ids") String ids);

    @Select("select * from User where UserId =#{Id}")
    User get(int Id);

    @Select("select * from User ${whereSql}")
    List<User> getList(@Param("whereSql") String whereSql);
    @Select("select u.UserId,u.Photo,u.NickName,p.PersonId,p.`Name`,c.CompanyName as company,d.`Name` as department" +
            ",j.`Name` as jobName,u.createTime from User as u INNER JOIN Person as p on u.PersonId=p.PersonId " +
            "left JOIN Rel_Company_Department_Job_User as r on u.UserId=r.UserId " +
            "left JOIN Company as c on r.CompanyId=c.CompanyId " +
            "left JOIN Department as d on r.DepartmentId=d.DepartmentId " +
            "left JOIN Job as j on r.JobId=j.JobId where u.NickName like '%${nickName}%'")
    List<UserView> getViewList(@Param("nickName") String nickName);
}