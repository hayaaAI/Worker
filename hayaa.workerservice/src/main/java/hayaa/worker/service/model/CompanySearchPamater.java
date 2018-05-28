package hayaa.worker.service.model;

import hayaa.basemodel.model.PamaterOperationType;
import hayaa.basemodel.model.SearchPamaterMariadbBase;

import java.util.List;

public class CompanySearchPamater extends SearchPamaterMariadbBase  {
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

    private String GetCompanyIdSqlForSharp() {
        String sql = "";
        switch (CompanyIdPOT) {
            case Between:
                sql = "CompanyId between :CompanyIdMin to :CompanyIdMax";
                break;
            case StringContains:
                sql = "CompanyId like '%:CompanyId%'";
                break;
            case Equal:
                sql = "CompanyId=:CompanyId";
                break;
            case GreaterEqual:
                sql = "CompanyId>=:CompanyId";
                break;
            case GreaterThan:
                sql = "CompanyId>:CompanyId";
                break;
            case LessEqual:
                sql = "CompanyId<=:CompanyId";
                break;
            case LessThan:
                sql = "CompanyId<=:CompanyId";
                break;
            case In:
                sql = "CompanyId in(" + String.join(",", (CharSequence) this.CompanyIdList) + ")";
                break;
            case StringIn:
                sql = "CompanyId in('" + String.join("','", (CharSequence) this.CompanyIdList) + "')";
                break;
        }
        return sql;
    }

    private String CompanyCode;

    public void setCompanyCode(String CompanyCodevalue) {
        this.CompanyCode = CompanyCodevalue;
    }

    public String getCompanyCode() {
        return this.CompanyCode;
    }

    private List<String> CompanyCodeList;

    public void setCompanyCodeList(List<String> CompanyCodevalue) {
        this.CompanyCodeList = CompanyCodevalue;
    }

    public List<String> getCompanyCodeList() {
        return this.CompanyCodeList;
    }

    private PamaterOperationType CompanyCodePOT;

    public void SetCompanyCode(String info, PamaterOperationType pot) {
        this.CompanyCode = info;
        this.CompanyCodePOT = pot;
    }

    private String GetCompanyCodeSqlForSharp() {
        String sql = "";
        switch (CompanyCodePOT) {
            case StringContains:
                sql = "CompanyCode like '%:CompanyCode%'";
                break;
            case Equal:
                sql = "CompanyCode=:CompanyCode";
                break;
            case GreaterEqual:
                sql = "CompanyCode>=:CompanyCode";
                break;
            case GreaterThan:
                sql = "CompanyCode>:CompanyCode";
                break;
            case LessEqual:
                sql = "CompanyCode<=:CompanyCode";
                break;
            case LessThan:
                sql = "CompanyCode<=:CompanyCode";
                break;
            case In:
                sql = "CompanyCode in(" + String.join(",", (CharSequence) this.CompanyCodeList) + ")";
                break;
            case StringIn:
                sql = "CompanyCode in('" + String.join("','", (CharSequence) this.CompanyCodeList) + "')";
                break;
        }
        return sql;
    }

    private String CompanyFullName;

    public void setCompanyFullName(String CompanyFullNamevalue) {
        this.CompanyFullName = CompanyFullNamevalue;
    }

    public String getCompanyFullName() {
        return this.CompanyFullName;
    }

    private List<String> CompanyFullNameList;

    public void setCompanyFullNameList(List<String> CompanyFullNamevalue) {
        this.CompanyFullNameList = CompanyFullNamevalue;
    }

    public List<String> getCompanyFullNameList() {
        return this.CompanyFullNameList;
    }

    private PamaterOperationType CompanyFullNamePOT;

    public void SetCompanyFullName(String info, PamaterOperationType pot) {
        this.CompanyFullName = info;
        this.CompanyFullNamePOT = pot;
    }

    private String GetCompanyFullNameSqlForSharp() {
        String sql = "";
        switch (CompanyFullNamePOT) {
            case StringContains:
                sql = "CompanyFullName like '%:CompanyFullName%'";
                break;
            case Equal:
                sql = "CompanyFullName=:CompanyFullName";
                break;
            case GreaterEqual:
                sql = "CompanyFullName>=:CompanyFullName";
                break;
            case GreaterThan:
                sql = "CompanyFullName>:CompanyFullName";
                break;
            case LessEqual:
                sql = "CompanyFullName<=:CompanyFullName";
                break;
            case LessThan:
                sql = "CompanyFullName<=:CompanyFullName";
                break;
            case In:
                sql = "CompanyFullName in(" + String.join(",", (CharSequence) this.CompanyFullNameList) + ")";
                break;
            case StringIn:
                sql = "CompanyFullName in('" + String.join("','", (CharSequence) this.CompanyFullNameList) + "')";
                break;
        }
        return sql;
    }

    private String CompanyName;

    public void setCompanyName(String CompanyNamevalue) {
        this.CompanyName = CompanyNamevalue;
    }

    public String getCompanyName() {
        return this.CompanyName;
    }

    private List<String> CompanyNameList;

    public void setCompanyNameList(List<String> CompanyNamevalue) {
        this.CompanyNameList = CompanyNamevalue;
    }

    public List<String> getCompanyNameList() {
        return this.CompanyNameList;
    }

    private PamaterOperationType CompanyNamePOT;

    public void SetCompanyName(String info, PamaterOperationType pot) {
        this.CompanyName = info;
        this.CompanyNamePOT = pot;
    }

    private String GetCompanyNameSqlForSharp() {
        String sql = "";
        switch (CompanyNamePOT) {
            case StringContains:
                sql = "CompanyName like '%:CompanyName%'";
                break;
            case Equal:
                sql = "CompanyName=:CompanyName";
                break;
            case GreaterEqual:
                sql = "CompanyName>=:CompanyName";
                break;
            case GreaterThan:
                sql = "CompanyName>:CompanyName";
                break;
            case LessEqual:
                sql = "CompanyName<=:CompanyName";
                break;
            case LessThan:
                sql = "CompanyName<=:CompanyName";
                break;
            case In:
                sql = "CompanyName in(" + String.join(",", (CharSequence) this.CompanyNameList) + ")";
                break;
            case StringIn:
                sql = "CompanyName in('" + String.join("','", (CharSequence) this.CompanyNameList) + "')";
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