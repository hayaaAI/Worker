package hayaa.worker.service.model;

import hayaa.basemodel.model.PamaterOperationType;
import hayaa.basemodel.model.SearchPamaterMariadbBase;

import java.util.List;

public class JobSearchPamater extends SearchPamaterMariadbBase{
    private Integer JobId;

    public void setJobId(Integer JobIdvalue) {
        this.JobId = JobIdvalue;
    }

    public Integer getJobId() {
        return this.JobId;
    }

    private List<Integer> JobIdList;

    public void setJobIdList(List<Integer> JobIdvalue) {
        this.JobIdList = JobIdvalue;
    }

    public List<Integer> getJobIdList() {
        return this.JobIdList;
    }

    private Integer JobIdMax;

    public void setJobIdMax(Integer JobIdvalue) {
        this.JobIdMax = JobIdvalue;
    }

    public Integer getJobIdMax() {
        return this.JobIdMax;
    }

    private Integer JobIdMin;

    public void setJobIdMin(Integer JobIdvalue) {
        this.JobIdMin = JobIdvalue;
    }

    public Integer getJobIdMin() {
        return this.JobIdMin;
    }

    public void setJobId(Integer max, Integer min) {
        this.JobIdMax = max;
        this.JobIdMin = min;
        this.JobIdPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType JobIdPOT;

    public void SetJobId(Integer info, PamaterOperationType pot) {
        this.JobId = info;
        this.JobIdPOT = pot;
    }

    private String GetJobIdSqlForSharp() {
        String sql = "";
        switch (JobIdPOT) {
            case Between:
                sql = "JobId between :JobIdMin to :JobIdMax";
                break;
            case StringContains:
                sql = "JobId like '%:JobId%'";
                break;
            case Equal:
                sql = "JobId=:JobId";
                break;
            case GreaterEqual:
                sql = "JobId>=:JobId";
                break;
            case GreaterThan:
                sql = "JobId>:JobId";
                break;
            case LessEqual:
                sql = "JobId<=:JobId";
                break;
            case LessThan:
                sql = "JobId<=:JobId";
                break;
            case In:
                sql = "JobId in(" + String.join(",", (CharSequence) this.JobIdList) + ")";
                break;
            case StringIn:
                sql = "JobId in('" + String.join("','", (CharSequence) this.JobIdList) + "')";
                break;
        }
        return sql;
    }

    private Integer DepartmentId;

    public void setDepartmentId(Integer DepartmentIdvalue, PamaterOperationType equal) {
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

    private String GetDepartmentIdSqlForSharp() {
        String sql = "";
        switch (DepartmentIdPOT) {
            case Between:
                sql = "DepartmentId between :DepartmentIdMin to :DepartmentIdMax";
                break;
            case StringContains:
                sql = "DepartmentId like '%:DepartmentId%'";
                break;
            case Equal:
                sql = "DepartmentId=:DepartmentId";
                break;
            case GreaterEqual:
                sql = "DepartmentId>=:DepartmentId";
                break;
            case GreaterThan:
                sql = "DepartmentId>:DepartmentId";
                break;
            case LessEqual:
                sql = "DepartmentId<=:DepartmentId";
                break;
            case LessThan:
                sql = "DepartmentId<=:DepartmentId";
                break;
            case In:
                sql = "DepartmentId in(" + String.join(",", (CharSequence) this.DepartmentIdList) + ")";
                break;
            case StringIn:
                sql = "DepartmentId in('" + String.join("','", (CharSequence) this.DepartmentIdList) + "')";
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

    private String GetNameSqlForSharp() {
        String sql = "";
        switch (NamePOT) {
            case StringContains:
                sql = "Name like '%:Name%'";
                break;
            case Equal:
                sql = "Name=:Name";
                break;
            case GreaterEqual:
                sql = "Name>=:Name";
                break;
            case GreaterThan:
                sql = "Name>:Name";
                break;
            case LessEqual:
                sql = "Name<=:Name";
                break;
            case LessThan:
                sql = "Name<=:Name";
                break;
            case In:
                sql = "Name in(" + String.join(",", (CharSequence) this.NameList) + ")";
                break;
            case StringIn:
                sql = "Name in('" + String.join("','", (CharSequence) this.NameList) + "')";
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

    private String GetTitleSqlForSharp() {
        String sql = "";
        switch (TitlePOT) {
            case StringContains:
                sql = "Title like '%:Title%'";
                break;
            case Equal:
                sql = "Title=:Title";
                break;
            case GreaterEqual:
                sql = "Title>=:Title";
                break;
            case GreaterThan:
                sql = "Title>:Title";
                break;
            case LessEqual:
                sql = "Title<=:Title";
                break;
            case LessThan:
                sql = "Title<=:Title";
                break;
            case In:
                sql = "Title in(" + String.join(",", (CharSequence) this.TitleList) + ")";
                break;
            case StringIn:
                sql = "Title in('" + String.join("','", (CharSequence) this.TitleList) + "')";
                break;
        }
        return sql;
    }

    private java.sql.Timestamp CreateTime;

    public void setCreateTime(java.sql.Timestamp CreateTimevalue) {
        this.CreateTime = CreateTimevalue;
    }

    public java.sql.Timestamp getCreateTime() {
        return this.CreateTime;
    }

    private List<java.sql.Timestamp> CreateTimeList;

    public void setCreateTimeList(List<java.sql.Timestamp> CreateTimevalue) {
        this.CreateTimeList = CreateTimevalue;
    }

    public List<java.sql.Timestamp> getCreateTimeList() {
        return this.CreateTimeList;
    }

    private java.sql.Timestamp CreateTimeMax;

    public void setCreateTimeMax(java.sql.Timestamp CreateTimevalue) {
        this.CreateTimeMax = CreateTimevalue;
    }

    public java.sql.Timestamp getCreateTimeMax() {
        return this.CreateTimeMax;
    }

    private java.sql.Timestamp CreateTimeMin;

    public void setCreateTimeMin(java.sql.Timestamp CreateTimevalue) {
        this.CreateTimeMin = CreateTimevalue;
    }

    public java.sql.Timestamp getCreateTimeMin() {
        return this.CreateTimeMin;
    }

    public void setCreateTime(java.sql.Timestamp max, java.sql.Timestamp min) {
        this.CreateTimeMax = max;
        this.CreateTimeMin = min;
        this.CreateTimePOT = PamaterOperationType.Between;
    }

    private PamaterOperationType CreateTimePOT;

    public void SetCreateTime(java.sql.Timestamp info, PamaterOperationType pot) {
        this.CreateTime = info;
        this.CreateTimePOT = pot;
    }

    private String GetCreateTimeSqlForSharp() {
        String sql = "";
        switch (CreateTimePOT) {
            case Between:
                sql = "CreateTime between :CreateTimeMin to :CreateTimeMax";
                break;
            case StringContains:
                sql = "CreateTime like '%:CreateTime%'";
                break;
            case Equal:
                sql = "CreateTime=:CreateTime";
                break;
            case GreaterEqual:
                sql = "CreateTime>=:CreateTime";
                break;
            case GreaterThan:
                sql = "CreateTime>:CreateTime";
                break;
            case LessEqual:
                sql = "CreateTime<=:CreateTime";
                break;
            case LessThan:
                sql = "CreateTime<=:CreateTime";
                break;
            case In:
                sql = "CreateTime in(" + String.join(",", (CharSequence) this.CreateTimeList) + ")";
                break;
            case StringIn:
                sql = "CreateTime in('" + String.join("','", (CharSequence) this.CreateTimeList) + "')";
                break;
        }
        return sql;
    }

    private java.sql.Timestamp UpdateTime;

    public void setUpdateTime(java.sql.Timestamp UpdateTimevalue) {
        this.UpdateTime = UpdateTimevalue;
    }

    public java.sql.Timestamp getUpdateTime() {
        return this.UpdateTime;
    }

    private List<java.sql.Timestamp> UpdateTimeList;

    public void setUpdateTimeList(List<java.sql.Timestamp> UpdateTimevalue) {
        this.UpdateTimeList = UpdateTimevalue;
    }

    public List<java.sql.Timestamp> getUpdateTimeList() {
        return this.UpdateTimeList;
    }

    private java.sql.Timestamp UpdateTimeMax;

    public void setUpdateTimeMax(java.sql.Timestamp UpdateTimevalue) {
        this.UpdateTimeMax = UpdateTimevalue;
    }

    public java.sql.Timestamp getUpdateTimeMax() {
        return this.UpdateTimeMax;
    }

    private java.sql.Timestamp UpdateTimeMin;

    public void setUpdateTimeMin(java.sql.Timestamp UpdateTimevalue) {
        this.UpdateTimeMin = UpdateTimevalue;
    }

    public java.sql.Timestamp getUpdateTimeMin() {
        return this.UpdateTimeMin;
    }

    public void setUpdateTime(java.sql.Timestamp max, java.sql.Timestamp min) {
        this.UpdateTimeMax = max;
        this.UpdateTimeMin = min;
        this.UpdateTimePOT = PamaterOperationType.Between;
    }

    private PamaterOperationType UpdateTimePOT;

    public void SetUpdateTime(java.sql.Timestamp info, PamaterOperationType pot) {
        this.UpdateTime = info;
        this.UpdateTimePOT = pot;
    }

    private String GetUpdateTimeSqlForSharp() {
        String sql = "";
        switch (UpdateTimePOT) {
            case Between:
                sql = "UpdateTime between :UpdateTimeMin to :UpdateTimeMax";
                break;
            case StringContains:
                sql = "UpdateTime like '%:UpdateTime%'";
                break;
            case Equal:
                sql = "UpdateTime=:UpdateTime";
                break;
            case GreaterEqual:
                sql = "UpdateTime>=:UpdateTime";
                break;
            case GreaterThan:
                sql = "UpdateTime>:UpdateTime";
                break;
            case LessEqual:
                sql = "UpdateTime<=:UpdateTime";
                break;
            case LessThan:
                sql = "UpdateTime<=:UpdateTime";
                break;
            case In:
                sql = "UpdateTime in(" + String.join(",", (CharSequence) this.UpdateTimeList) + ")";
                break;
            case StringIn:
                sql = "UpdateTime in('" + String.join("','", (CharSequence) this.UpdateTimeList) + "')";
                break;
        }
        return sql;
    }
}