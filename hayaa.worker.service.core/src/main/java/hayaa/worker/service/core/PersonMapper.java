package hayaa.worker.service.core;

import hayaa.worker.service.model.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
interface PersonMapper {
    @Insert("insert into Person(Name,Sex,Birthday,ID,AI) values(#{person.Name},#{person.Sex},#{person.Birthday},#{person.id},#{person.ai});")
    @Options(useGeneratedKeys = true, keyProperty = "person.PersonId")
    void insert(@Param("person") Person person);

    @Update("update Person set Name=#{person.Name},Sex=#{person.Sex},Birthday=#{person.Birthday},ID=#{person.id},AI=#{person.ai} where PersonId=#{person.PersonId}")
    Boolean update(@Param("person") Person person);

    @Delete("delete from Person where personId in (${ids})")
    Boolean delete(@Param("ids") String ids);

    @Select("select * from Person where PersonId =#{Id}")
    Person get(int Id);

    @Select("select * from Person ${whereSql}")
    List<Person> getList(@Param("whereSql") String whereSql);
    @Select("select p.* from Person as  p inner join User as u on p.PersonId=u.PersonId INNER JOIN " +
            "Rel_Company_Department_Job_User as r on u.UserId=r.UserId where r.DepartmentId=#{departmentId}")
    List<Person> getListByDepartmentId(int departmentId);
}