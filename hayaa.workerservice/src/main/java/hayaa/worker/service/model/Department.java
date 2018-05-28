package hayaa.worker.service.model;

import hayaa.basemodel.model.BaseData;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Department extends BaseData {
    private Integer DepartmentId;

    public void setDepartmentId(Integer DepartmentIdvalue) {
        this.DepartmentId = DepartmentIdvalue;
    }

    public Integer getDepartmentId() {
        return this.DepartmentId;
    }

    private Integer CompanyId;

    public void setCompanyId(Integer CompanyIdvalue) {
        this.CompanyId = CompanyIdvalue;
    }

    public Integer getCompanyId() {
        return this.CompanyId;
    }

    private String Name;

    public void setName(String Namevalue) {
        this.Name = Namevalue;
    }

    public String getName() {
        return this.Name;
    }

    private String Title;

    public void setTitle(String Titlevalue) {
        this.Title = Titlevalue;
    }

    public String getTitle() {
        return this.Title;
    }

    private String Remark;

    public void setRemark(String Remarkvalue) {
        this.Remark = Remarkvalue;
    }

    public String getRemark() {
        return this.Remark;
    }
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date Birdthday;

    public void setBirdthday(Date Birdthdayvalue) {
        this.Birdthday = Birdthdayvalue;
    }

    public Date getBirdthday() {
        return this.Birdthday;
    }


}