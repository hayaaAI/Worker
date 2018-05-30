package hayaa.worker.service.core;

import hayaa.worker.service.model.Job;
import hayaa.worker.service.model.JobSearchPamater;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
interface JobMapper {
    @Insert("insert into Job(DepartmentId,Name,Title) values(#{job.DepartmentId},#{job.Name},#{job.Title});")
    @Options(useGeneratedKeys = true, keyProperty = "job.JobId")
    void insert(@Param("job") Job job);

    @Update("update Job set DepartmentId=#{job.DepartmentId},Name=#{job.Name},Title=#{job.Title} where JobId=#{job.JobId}")
    Boolean update(@Param("job") Job job);

    @Delete("delete from Job where jobId in (${ids})")
    Boolean delete(@Param("ids") String ids);

    @Select("select * from Job where JobId =#{Id}")
    Job get(int Id);

    List<Job> getList(@Param("searchPamater") JobSearchPamater searchPamater);
}