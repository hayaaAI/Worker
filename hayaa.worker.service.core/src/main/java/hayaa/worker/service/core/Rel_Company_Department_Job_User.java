package hayaa.worker.service.core;

import hayaa.basemodel.model.BaseData;

import java.util.Date;

public class Rel_Company_Department_Job_User extends BaseData {
    private Integer Id;

    public void setId(Integer Idvalue) {
        this.Id = Idvalue;
    }

    public Integer getId() {
        return this.Id;
    }

    private Integer CompanyId;

    public void setCompanyId(Integer CompanyIdvalue) {
        this.CompanyId = CompanyIdvalue;
    }

    public Integer getCompanyId() {
        return this.CompanyId;
    }

    private Integer DepartmentId;

    public void setDepartmentId(Integer DepartmentIdvalue) {
        this.DepartmentId = DepartmentIdvalue;
    }

    public Integer getDepartmentId() {
        return this.DepartmentId;
    }

    private Integer JobId;

    public void setJobId(Integer JobIdvalue) {
        this.JobId = JobIdvalue;
    }

    public Integer getJobId() {
        return this.JobId;
    }

    private Integer UserId;

    public void setUserId(Integer UserIdvalue) {
        this.UserId = UserIdvalue;
    }

    public Integer getUserId() {
        return this.UserId;
    }

    private Boolean Status;

    public void setStatus(Boolean Statusvalue) {
        this.Status = Statusvalue;
    }

    public Boolean getStatus() {
        return this.Status;
    }

    private Date CreateTime;

    public void setCreateTime(Date CreateTimevalue) {
        this.CreateTime = CreateTimevalue;
    }

    public Date getCreateTime() {
        return this.CreateTime;
    }

    private Date UpdateTime;

    public void setUpdateTime(Date UpdateTimevalue) {
        this.UpdateTime = UpdateTimevalue;
    }

    public Date getUpdateTime() {
        return this.UpdateTime;
    }
}