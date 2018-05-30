package hayaa.worker.service.model;

import hayaa.basemodel.model.PamaterOperationType;
import hayaa.basemodel.model.BaseData;
import hayaa.basemodel.model.SearchPamaterMariadbBase;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DepartmentSearchPamater extends SearchPamaterMariadbBase {
    private Integer DepartmentId;

    public void setDepartmentId(Integer DepartmentIdvalue) {
        this.DepartmentId = DepartmentIdvalue;
    }

    public Integer getDepartmentId() {
        return this.DepartmentId;
    }

    private List<Integer> DepartmentIdList;

    public void setDepartmentIdList(List<Integer> DepartmentIdvalue) {
        this.DepartmentIdList = DepartmentIdvalue;
    }

    public List<Integer> getDepartmentIdList() {
        return this.DepartmentIdList;
    }

    private Integer DepartmentIdMax;

    public void setDepartmentIdMax(Integer DepartmentIdvalue) {
        this.DepartmentIdMax = DepartmentIdvalue;
    }

    public Integer getDepartmentIdMax() {
        return this.DepartmentIdMax;
    }

    private Integer DepartmentIdMin;

    public void setDepartmentIdMin(Integer DepartmentIdvalue) {
        this.DepartmentIdMin = DepartmentIdvalue;
    }

    public Integer getDepartmentIdMin() {
        return this.DepartmentIdMin;
    }

    public void setDepartmentId(Integer max, Integer min) {
        this.DepartmentIdMax = max;
        this.DepartmentIdMin = min;
        this.DepartmentIdPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType DepartmentIdPOT;

    public void SetDepartmentId(Integer info, PamaterOperationType pot) {
        this.DepartmentId = info;
        this.DepartmentIdPOT = pot;
    }

    protected String getDepartmentIdSql() {
        String sql = "";
        switch (DepartmentIdPOT) {
            case Between:
                sql = "DepartmentId between #{DepartmentId}Min to #{DepartmentId}Max";
                break;
            case StringContains:
                sql = "DepartmentId like '%#{DepartmentId}%'";
                break;
            case Equal:
                sql = "DepartmentId=#{DepartmentId}";
                break;
            case GreaterEqual:
                sql = "DepartmentId>=#{DepartmentId}";
                break;
            case GreaterThan:
                sql = "DepartmentId>#{DepartmentId}";
                break;
            case LessEqual:
                sql = "DepartmentId<=#{DepartmentId}";
                break;
            case LessThan:
                sql = "DepartmentId<=#{DepartmentId}";
                break;
            case In:
                String strArr = this.DepartmentIdList.toString().replace("[", "").replace("]", "");
                sql = "DepartmentId in(" + String.join(",", strArr) + ")";
                break;
            case StringIn:
                String strList = this.DepartmentIdList.toString().replace("[", "").replace("]", "");
                sql = "DepartmentId in('" + String.join("','", strList) + "')";
                break;
        }
        return sql;
    }

    private Integer ParentId;

    public void setParentId(Integer ParentIdvalue) {
        this.ParentId = ParentIdvalue;
    }

    public Integer getParentId() {
        return this.ParentId;
    }

    private List<Integer> ParentIdList;

    public void setParentIdList(List<Integer> ParentIdvalue) {
        this.ParentIdList = ParentIdvalue;
    }

    public List<Integer> getParentIdList() {
        return this.ParentIdList;
    }

    private Integer ParentIdMax;

    public void setParentIdMax(Integer ParentIdvalue) {
        this.ParentIdMax = ParentIdvalue;
    }

    public Integer getParentIdMax() {
        return this.ParentIdMax;
    }

    private Integer ParentIdMin;

    public void setParentIdMin(Integer ParentIdvalue) {
        this.ParentIdMin = ParentIdvalue;
    }

    public Integer getParentIdMin() {
        return this.ParentIdMin;
    }

    public void setParentId(Integer max, Integer min) {
        this.ParentIdMax = max;
        this.ParentIdMin = min;
        this.ParentIdPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType ParentIdPOT;

    public void SetParentId(Integer info, PamaterOperationType pot) {
        this.ParentId = info;
        this.ParentIdPOT = pot;
    }

    protected String getParentIdSql() {
        String sql = "";
        switch (ParentIdPOT) {
            case Between:
                sql = "ParentId between #{ParentId}Min to #{ParentId}Max";
                break;
            case StringContains:
                sql = "ParentId like '%#{ParentId}%'";
                break;
            case Equal:
                sql = "ParentId=#{ParentId}";
                break;
            case GreaterEqual:
                sql = "ParentId>=#{ParentId}";
                break;
            case GreaterThan:
                sql = "ParentId>#{ParentId}";
                break;
            case LessEqual:
                sql = "ParentId<=#{ParentId}";
                break;
            case LessThan:
                sql = "ParentId<=#{ParentId}";
                break;
            case In:
                String strArr = this.ParentIdList.toString().replace("[", "").replace("]", "");
                sql = "ParentId in(" + String.join(",", strArr) + ")";
                break;
            case StringIn:
                String strList = this.ParentIdList.toString().replace("[", "").replace("]", "");
                sql = "ParentId in('" + String.join("','", strList) + "')";
                break;
        }
        return sql;
    }

    private Integer CompanyId;

    public void setCompanyId(Integer CompanyIdvalue) {
        this.CompanyId = CompanyIdvalue;
    }

    public Integer getCompanyId() {
        return this.CompanyId;
    }

    private List<Integer> CompanyIdList;

    public void setCompanyIdList(List<Integer> CompanyIdvalue) {
        this.CompanyIdList = CompanyIdvalue;
    }

    public List<Integer> getCompanyIdList() {
        return this.CompanyIdList;
    }

    private Integer CompanyIdMax;

    public void setCompanyIdMax(Integer CompanyIdvalue) {
        this.CompanyIdMax = CompanyIdvalue;
    }

    public Integer getCompanyIdMax() {
        return this.CompanyIdMax;
    }

    private Integer CompanyIdMin;

    public void setCompanyIdMin(Integer CompanyIdvalue) {
        this.CompanyIdMin = CompanyIdvalue;
    }

    public Integer getCompanyIdMin() {
        return this.CompanyIdMin;
    }

    public void setCompanyId(Integer max, Integer min) {
        this.CompanyIdMax = max;
        this.CompanyIdMin = min;
        this.CompanyIdPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType CompanyIdPOT;

    public void SetCompanyId(Integer info, PamaterOperationType pot) {
        this.CompanyId = info;
        this.CompanyIdPOT = pot;
    }

    protected String getCompanyIdSql() {
        String sql = "";
        switch (CompanyIdPOT) {
            case Between:
                sql = "CompanyId between #{CompanyId}Min to #{CompanyId}Max";
                break;
            case StringContains:
                sql = "CompanyId like '%#{CompanyId}%'";
                break;
            case Equal:
                sql = "CompanyId=#{CompanyId}";
                break;
            case GreaterEqual:
                sql = "CompanyId>=#{CompanyId}";
                break;
            case GreaterThan:
                sql = "CompanyId>#{CompanyId}";
                break;
            case LessEqual:
                sql = "CompanyId<=#{CompanyId}";
                break;
            case LessThan:
                sql = "CompanyId<=#{CompanyId}";
                break;
            case In:
                String strArr = this.CompanyIdList.toString().replace("[", "").replace("]", "");
                sql = "CompanyId in(" + String.join(",", strArr) + ")";
                break;
            case StringIn:
                String strList = this.CompanyIdList.toString().replace("[", "").replace("]", "");
                sql = "CompanyId in('" + String.join("','", strList) + "')";
                break;
        }
        return sql;
    }

    private String Name;

    public void setName(String Namevalue) {
        this.Name = Namevalue;
    }

    public String getName() {
        return this.Name;
    }

    private List<String> NameList;

    public void setNameList(List<String> Namevalue) {
        this.NameList = Namevalue;
    }

    public List<String> getNameList() {
        return this.NameList;
    }

    private PamaterOperationType NamePOT;

    public void SetName(String info, PamaterOperationType pot) {
        this.Name = info;
        this.NamePOT = pot;
    }

    protected String getNameSql() {
        String sql = "";
        switch (NamePOT) {
            case StringContains:
                sql = "Name like '%#{Name}%'";
                break;
            case Equal:
                sql = "Name=#{Name}";
                break;
            case GreaterEqual:
                sql = "Name>=#{Name}";
                break;
            case GreaterThan:
                sql = "Name>#{Name}";
                break;
            case LessEqual:
                sql = "Name<=#{Name}";
                break;
            case LessThan:
                sql = "Name<=#{Name}";
                break;
            case In:
                String strArr = this.NameList.toString().replace("[", "").replace("]", "");
                sql = "Name in(" + String.join(",", strArr) + ")";
                break;
            case StringIn:
                String strList = this.NameList.toString().replace("[", "").replace("]", "");
                sql = "Name in('" + String.join("','", strList) + "')";
                break;
        }
        return sql;
    }

    private String Title;

    public void setTitle(String Titlevalue) {
        this.Title = Titlevalue;
    }

    public String getTitle() {
        return this.Title;
    }

    private List<String> TitleList;

    public void setTitleList(List<String> Titlevalue) {
        this.TitleList = Titlevalue;
    }

    public List<String> getTitleList() {
        return this.TitleList;
    }

    private PamaterOperationType TitlePOT;

    public void SetTitle(String info, PamaterOperationType pot) {
        this.Title = info;
        this.TitlePOT = pot;
    }

    protected String getTitleSql() {
        String sql = "";
        switch (TitlePOT) {
            case StringContains:
                sql = "Title like '%#{Title}%'";
                break;
            case Equal:
                sql = "Title=#{Title}";
                break;
            case GreaterEqual:
                sql = "Title>=#{Title}";
                break;
            case GreaterThan:
                sql = "Title>#{Title}";
                break;
            case LessEqual:
                sql = "Title<=#{Title}";
                break;
            case LessThan:
                sql = "Title<=#{Title}";
                break;
            case In:
                String strArr = this.TitleList.toString().replace("[", "").replace("]", "");
                sql = "Title in(" + String.join(",", strArr) + ")";
                break;
            case StringIn:
                String strList = this.TitleList.toString().replace("[", "").replace("]", "");
                sql = "Title in('" + String.join("','", strList) + "')";
                break;
        }
        return sql;
    }

    private String Remark;

    public void setRemark(String Remarkvalue) {
        this.Remark = Remarkvalue;
    }

    public String getRemark() {
        return this.Remark;
    }

    private List<String> RemarkList;

    public void setRemarkList(List<String> Remarkvalue) {
        this.RemarkList = Remarkvalue;
    }

    public List<String> getRemarkList() {
        return this.RemarkList;
    }

    private PamaterOperationType RemarkPOT;

    public void SetRemark(String info, PamaterOperationType pot) {
        this.Remark = info;
        this.RemarkPOT = pot;
    }

    protected String getRemarkSql() {
        String sql = "";
        switch (RemarkPOT) {
            case StringContains:
                sql = "Remark like '%#{Remark}%'";
                break;
            case Equal:
                sql = "Remark=#{Remark}";
                break;
            case GreaterEqual:
                sql = "Remark>=#{Remark}";
                break;
            case GreaterThan:
                sql = "Remark>#{Remark}";
                break;
            case LessEqual:
                sql = "Remark<=#{Remark}";
                break;
            case LessThan:
                sql = "Remark<=#{Remark}";
                break;
            case In:
                String strArr = this.RemarkList.toString().replace("[", "").replace("]", "");
                sql = "Remark in(" + String.join(",", strArr) + ")";
                break;
            case StringIn:
                String strList = this.RemarkList.toString().replace("[", "").replace("]", "");
                sql = "Remark in('" + String.join("','", strList) + "')";
                break;
        }
        return sql;
    }

    private Date Birdthday;

    public void setBirdthday(Date Birdthdayvalue) {
        this.Birdthday = Birdthdayvalue;
    }

    public Date getBirdthday() {
        return this.Birdthday;
    }

    private List<Date> BirdthdayList;

    public void setBirdthdayList(List<Date> Birdthdayvalue) {
        this.BirdthdayList = Birdthdayvalue;
    }

    public List<Date> getBirdthdayList() {
        return this.BirdthdayList;
    }

    private Date BirdthdayMax;

    public void setBirdthdayMax(Date Birdthdayvalue) {
        this.BirdthdayMax = Birdthdayvalue;
    }

    public Date getBirdthdayMax() {
        return this.BirdthdayMax;
    }

    private Date BirdthdayMin;

    public void setBirdthdayMin(Date Birdthdayvalue) {
        this.BirdthdayMin = Birdthdayvalue;
    }

    public Date getBirdthdayMin() {
        return this.BirdthdayMin;
    }

    public void setBirdthday(Date max, Date min) {
        this.BirdthdayMax = max;
        this.BirdthdayMin = min;
        this.BirdthdayPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType BirdthdayPOT;

    public void SetBirdthday(Date info, PamaterOperationType pot) {
        this.Birdthday = info;
        this.BirdthdayPOT = pot;
    }

    protected String getBirdthdaySql() {
        String sql = "";
        switch (BirdthdayPOT) {
            case Between:
                sql = "Birdthday between #{Birdthday}Min to #{Birdthday}Max";
                break;
            case StringContains:
                sql = "Birdthday like '%#{Birdthday}%'";
                break;
            case Equal:
                sql = "Birdthday=#{Birdthday}";
                break;
            case GreaterEqual:
                sql = "Birdthday>=#{Birdthday}";
                break;
            case GreaterThan:
                sql = "Birdthday>#{Birdthday}";
                break;
            case LessEqual:
                sql = "Birdthday<=#{Birdthday}";
                break;
            case LessThan:
                sql = "Birdthday<=#{Birdthday}";
                break;
            case In:
                String strArr = this.BirdthdayList.toString().replace("[", "").replace("]", "");
                sql = "Birdthday in(" + String.join(",", strArr) + ")";
                break;
            case StringIn:
                String strList = this.BirdthdayList.toString().replace("[", "").replace("]", "");
                sql = "Birdthday in('" + String.join("','", strList) + "')";
                break;
        }
        return sql;
    }

    private Date CreateTime;

    public void setCreateTime(Date CreateTimevalue) {
        this.CreateTime = CreateTimevalue;
    }

    public Date getCreateTime() {
        return this.CreateTime;
    }

    private List<Date> CreateTimeList;

    public void setCreateTimeList(List<Date> CreateTimevalue) {
        this.CreateTimeList = CreateTimevalue;
    }

    public List<Date> getCreateTimeList() {
        return this.CreateTimeList;
    }

    private Date CreateTimeMax;

    public void setCreateTimeMax(Date CreateTimevalue) {
        this.CreateTimeMax = CreateTimevalue;
    }

    public Date getCreateTimeMax() {
        return this.CreateTimeMax;
    }

    private Date CreateTimeMin;

    public void setCreateTimeMin(Date CreateTimevalue) {
        this.CreateTimeMin = CreateTimevalue;
    }

    public Date getCreateTimeMin() {
        return this.CreateTimeMin;
    }

    public void setCreateTime(Date max, Date min) {
        this.CreateTimeMax = max;
        this.CreateTimeMin = min;
        this.CreateTimePOT = PamaterOperationType.Between;
    }

    private PamaterOperationType CreateTimePOT;

    public void SetCreateTime(Date info, PamaterOperationType pot) {
        this.CreateTime = info;
        this.CreateTimePOT = pot;
    }

    protected String getCreateTimeSql() {
        String sql = "";
        switch (CreateTimePOT) {
            case Between:
                sql = "CreateTime between #{CreateTime}Min to #{CreateTime}Max";
                break;
            case StringContains:
                sql = "CreateTime like '%#{CreateTime}%'";
                break;
            case Equal:
                sql = "CreateTime=#{CreateTime}";
                break;
            case GreaterEqual:
                sql = "CreateTime>=#{CreateTime}";
                break;
            case GreaterThan:
                sql = "CreateTime>#{CreateTime}";
                break;
            case LessEqual:
                sql = "CreateTime<=#{CreateTime}";
                break;
            case LessThan:
                sql = "CreateTime<=#{CreateTime}";
                break;
            case In:
                String strArr = this.CreateTimeList.toString().replace("[", "").replace("]", "");
                sql = "CreateTime in(" + String.join(",", strArr) + ")";
                break;
            case StringIn:
                String strList = this.CreateTimeList.toString().replace("[", "").replace("]", "");
                sql = "CreateTime in('" + String.join("','", strList) + "')";
                break;
        }
        return sql;
    }

    private Date UpdateTime;

    public void setUpdateTime(Date UpdateTimevalue) {
        this.UpdateTime = UpdateTimevalue;
    }

    public Date getUpdateTime() {
        return this.UpdateTime;
    }

    private List<Date> UpdateTimeList;

    public void setUpdateTimeList(List<Date> UpdateTimevalue) {
        this.UpdateTimeList = UpdateTimevalue;
    }

    public List<Date> getUpdateTimeList() {
        return this.UpdateTimeList;
    }

    private Date UpdateTimeMax;

    public void setUpdateTimeMax(Date UpdateTimevalue) {
        this.UpdateTimeMax = UpdateTimevalue;
    }

    public Date getUpdateTimeMax() {
        return this.UpdateTimeMax;
    }

    private Date UpdateTimeMin;

    public void setUpdateTimeMin(Date UpdateTimevalue) {
        this.UpdateTimeMin = UpdateTimevalue;
    }

    public Date getUpdateTimeMin() {
        return this.UpdateTimeMin;
    }

    public void setUpdateTime(Date max, Date min) {
        this.UpdateTimeMax = max;
        this.UpdateTimeMin = min;
        this.UpdateTimePOT = PamaterOperationType.Between;
    }

    private PamaterOperationType UpdateTimePOT;

    public void SetUpdateTime(Date info, PamaterOperationType pot) {
        this.UpdateTime = info;
        this.UpdateTimePOT = pot;
    }

    protected String getUpdateTimeSql() {
        String sql = "";
        switch (UpdateTimePOT) {
            case Between:
                sql = "UpdateTime between #{UpdateTime}Min to #{UpdateTime}Max";
                break;
            case StringContains:
                sql = "UpdateTime like '%#{UpdateTime}%'";
                break;
            case Equal:
                sql = "UpdateTime=#{UpdateTime}";
                break;
            case GreaterEqual:
                sql = "UpdateTime>=#{UpdateTime}";
                break;
            case GreaterThan:
                sql = "UpdateTime>#{UpdateTime}";
                break;
            case LessEqual:
                sql = "UpdateTime<=#{UpdateTime}";
                break;
            case LessThan:
                sql = "UpdateTime<=#{UpdateTime}";
                break;
            case In:
                String strArr = this.UpdateTimeList.toString().replace("[", "").replace("]", "");
                sql = "UpdateTime in(" + String.join(",", strArr) + ")";
                break;
            case StringIn:
                String strList = this.UpdateTimeList.toString().replace("[", "").replace("]", "");
                sql = "UpdateTime in('" + String.join("','", strList) + "')";
                break;
        }
        return sql;
    }
}