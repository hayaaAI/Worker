package hayaa.worker.service.model;

import hayaa.basemodel.model.GridPager.PagerTotal;
import hayaa.basemodel.model.PamaterOperationType;
import hayaa.basemodel.model.BaseData;
import hayaa.basemodel.model.SearchPamaterMariadbBase;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DepartmentSearchPamater extends SearchPamaterMariadbBase implements PagerTotal {
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

    private String GetRemarkSqlForSharp() {
        String sql = "";
        switch (RemarkPOT) {
            case StringContains:
                sql = "Remark like '%:Remark%'";
                break;
            case Equal:
                sql = "Remark=:Remark";
                break;
            case GreaterEqual:
                sql = "Remark>=:Remark";
                break;
            case GreaterThan:
                sql = "Remark>:Remark";
                break;
            case LessEqual:
                sql = "Remark<=:Remark";
                break;
            case LessThan:
                sql = "Remark<=:Remark";
                break;
            case In:
                sql = "Remark in(" + String.join(",", (CharSequence) this.RemarkList) + ")";
                break;
            case StringIn:
                sql = "Remark in('" + String.join("','", (CharSequence) this.RemarkList) + "')";
                break;
        }
        return sql;
    }

    private java.sql.Date Birdthday;

    public void setBirdthday(java.sql.Date Birdthdayvalue) {
        this.Birdthday = Birdthdayvalue;
    }

    public java.sql.Date getBirdthday() {
        return this.Birdthday;
    }

    private List<java.sql.Date> BirdthdayList;

    public void setBirdthdayList(List<java.sql.Date> Birdthdayvalue) {
        this.BirdthdayList = Birdthdayvalue;
    }

    public List<java.sql.Date> getBirdthdayList() {
        return this.BirdthdayList;
    }

    private java.sql.Date BirdthdayMax;

    public void setBirdthdayMax(java.sql.Date Birdthdayvalue) {
        this.BirdthdayMax = Birdthdayvalue;
    }

    public java.sql.Date getBirdthdayMax() {
        return this.BirdthdayMax;
    }

    private java.sql.Date BirdthdayMin;

    public void setBirdthdayMin(java.sql.Date Birdthdayvalue) {
        this.BirdthdayMin = Birdthdayvalue;
    }

    public java.sql.Date getBirdthdayMin() {
        return this.BirdthdayMin;
    }

    public void setBirdthday(java.sql.Date max, java.sql.Date min) {
        this.BirdthdayMax = max;
        this.BirdthdayMin = min;
        this.BirdthdayPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType BirdthdayPOT;

    public void SetBirdthday(java.sql.Date info, PamaterOperationType pot) {
        this.Birdthday = info;
        this.BirdthdayPOT = pot;
    }

    private String GetBirdthdaySqlForSharp() {
        String sql = "";
        switch (BirdthdayPOT) {
            case Between:
                sql = "Birdthday between :BirdthdayMin to :BirdthdayMax";
                break;
            case StringContains:
                sql = "Birdthday like '%:Birdthday%'";
                break;
            case Equal:
                sql = "Birdthday=:Birdthday";
                break;
            case GreaterEqual:
                sql = "Birdthday>=:Birdthday";
                break;
            case GreaterThan:
                sql = "Birdthday>:Birdthday";
                break;
            case LessEqual:
                sql = "Birdthday<=:Birdthday";
                break;
            case LessThan:
                sql = "Birdthday<=:Birdthday";
                break;
            case In:
                sql = "Birdthday in(" + String.join(",", (CharSequence) this.BirdthdayList) + ")";
                break;
            case StringIn:
                sql = "Birdthday in('" + String.join("','", (CharSequence) this.BirdthdayList) + "')";
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