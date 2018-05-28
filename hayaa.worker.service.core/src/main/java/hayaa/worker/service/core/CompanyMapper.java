package hayaa.worker.service.core;

import com.github.pagehelper.Page;
import hayaa.worker.service.model.Company;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CompanyMapper {

    @Insert("insert into Company(companyCode,companyFullName,companyName,birdthday) values(#{company.companyCode},#{company.companyFullName},#{company.companyName},#{company.birdthday})")
    @Options(useGeneratedKeys = true, keyProperty = "company.companyId")
    void insert(@Param("company") Company info);
    @Update("update Company set companyCode=#{company.companyCode},companyFullName=#{company.companyFullName}," +
            "companyName=#{company.companyName},birdthday=#{company.birdthday} where companyId=#{company.companyId}")
    Boolean update(@Param("company") Company info);
    @Delete("delete from  Company where companyId in ${ids}")
    Boolean delete(@Param("ids") String ids);
    @Select("select * from Company  where companyId=#{Id}")
    Company get(int Id);
    @Select("select * from Company  where ${whereSql}")
    List<Company> getList(@Param("whereSql") String whereSql);
    @Select("select * from Company  where ${whereSql}")
    Page<Company> getPager(@Param("whereSql") String whereSql);
}
