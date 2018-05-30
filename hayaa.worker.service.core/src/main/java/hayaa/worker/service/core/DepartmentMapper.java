package hayaa.worker.service.core;

import hayaa.worker.service.model.Department;
import hayaa.worker.service.model.DepartmentSearchPamater;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
interface DepartmentMapper {
    @Insert("insert into Department(ParentId,CompanyId,Name,Title,Remark,Birdthday) values(#{department.ParentId},#{department.CompanyId},#{department.Name},#{department.Title},#{department.Remark},#{department.Birdthday});")
    @Options(useGeneratedKeys = true, keyProperty = "department.DepartmentId")
    void insert(@Param("department") Department department);

    @Update("update Department set ParentId=#{department.ParentId},CompanyId=#{department.CompanyId},Name=#{department.Name},Title=#{department.Title},Remark=#{department.Remark},Birdthday=#{department.Birdthday} where DepartmentId=#{department.DepartmentId}")
    Boolean update(@Param("department") Department department);

    @Delete("delete from Department where departmentId in (${ids})")
    Boolean delete(@Param("ids") String ids);

    @Select("select * from Department where DepartmentId =#{Id}")
    Department get(int Id);

    List<Department> getList(@Param("searchPamater") DepartmentSearchPamater searchPamater);
}