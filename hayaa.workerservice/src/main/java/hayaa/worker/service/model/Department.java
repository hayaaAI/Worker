package hayaa.worker.service.model;

import hayaa.basemodel.model.GridPager.PagerTotal;
import hayaa.basemodel.model.PamaterOperationType;
import hayaa.basemodel.model.BaseData;
import hayaa.basemodel.model.SearchPamaterMariadbBase;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Department extends BaseData {
    private Integer DepartmentId;

    public void setDepartmentId(Integer DepartmentIdvalue) {
        this.DepartmentId = DepartmentIdvalue;
    }

    public Integer getDepartmentId() {
        return this.DepartmentId;
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

    private java.sql.Date Birdthday;

    public void setBirdthday(java.sql.Date Birdthdayvalue) {
        this.Birdthday = Birdthdayvalue;
    }

    public java.sql.Date getBirdthday() {
        return this.Birdthday;
    }

    private java.sql.Timestamp CreateTime;

    public void setCreateTime(java.sql.Timestamp CreateTimevalue) {
        this.CreateTime = CreateTimevalue;
    }

    public java.sql.Timestamp getCreateTime() {
        return this.CreateTime;
    }

    private java.sql.Timestamp UpdateTime;

    public void setUpdateTime(java.sql.Timestamp UpdateTimevalue) {
        this.UpdateTime = UpdateTimevalue;
    }

    public java.sql.Timestamp getUpdateTime() {
        return this.UpdateTime;
    }
}