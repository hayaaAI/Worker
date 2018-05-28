package hayaa.worker.service.model;

import hayaa.basemodel.model.PamaterOperationType;
import hayaa.basemodel.model.SearchPamaterMariadbBase;

import java.util.List;

public class PersonSearchPamater extends SearchPamaterMariadbBase  {
    private Integer PersonId;

    public void setPersonId(Integer PersonIdvalue) {
        this.PersonId = PersonIdvalue;
    }

    public Integer getPersonId() {
        return this.PersonId;
    }

    private List<Integer> PersonIdList;

    public void setPersonIdList(List<Integer> PersonIdvalue) {
        this.PersonIdList = PersonIdvalue;
    }

    public List<Integer> getPersonIdList() {
        return this.PersonIdList;
    }

    private Integer PersonIdMax;

    public void setPersonIdMax(Integer PersonIdvalue) {
        this.PersonIdMax = PersonIdvalue;
    }

    public Integer getPersonIdMax() {
        return this.PersonIdMax;
    }

    private Integer PersonIdMin;

    public void setPersonIdMin(Integer PersonIdvalue) {
        this.PersonIdMin = PersonIdvalue;
    }

    public Integer getPersonIdMin() {
        return this.PersonIdMin;
    }

    public void setPersonId(Integer max, Integer min) {
        this.PersonIdMax = max;
        this.PersonIdMin = min;
        this.PersonIdPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType PersonIdPOT;

    public void SetPersonId(Integer info, PamaterOperationType pot) {
        this.PersonId = info;
        this.PersonIdPOT = pot;
    }

    private String GetPersonIdSqlForSharp() {
        String sql = "";
        switch (PersonIdPOT) {
            case Between:
                sql = "PersonId between :PersonIdMin to :PersonIdMax";
                break;
            case StringContains:
                sql = "PersonId like '%:PersonId%'";
                break;
            case Equal:
                sql = "PersonId=:PersonId";
                break;
            case GreaterEqual:
                sql = "PersonId>=:PersonId";
                break;
            case GreaterThan:
                sql = "PersonId>:PersonId";
                break;
            case LessEqual:
                sql = "PersonId<=:PersonId";
                break;
            case LessThan:
                sql = "PersonId<=:PersonId";
                break;
            case In:
                sql = "PersonId in(" + String.join(",", (CharSequence) this.PersonIdList) + ")";
                break;
            case StringIn:
                sql = "PersonId in('" + String.join("','", (CharSequence) this.PersonIdList) + "')";
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

    private Boolean Sex;

    public void setSex(Boolean Sexvalue) {
        this.Sex = Sexvalue;
    }

    public Boolean getSex() {
        return this.Sex;
    }

    private List<Boolean> SexList;

    public void setSexList(List<Boolean> Sexvalue) {
        this.SexList = Sexvalue;
    }

    public List<Boolean> getSexList() {
        return this.SexList;
    }

    private Boolean SexMax;

    public void setSexMax(Boolean Sexvalue) {
        this.SexMax = Sexvalue;
    }

    public Boolean getSexMax() {
        return this.SexMax;
    }

    private Boolean SexMin;

    public void setSexMin(Boolean Sexvalue) {
        this.SexMin = Sexvalue;
    }

    public Boolean getSexMin() {
        return this.SexMin;
    }

    public void setSex(Boolean max, Boolean min) {
        this.SexMax = max;
        this.SexMin = min;
        this.SexPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType SexPOT;

    public void SetSex(Boolean info, PamaterOperationType pot) {
        this.Sex = info;
        this.SexPOT = pot;
    }

    private String GetSexSqlForSharp() {
        String sql = "";
        switch (SexPOT) {
            case Between:
                sql = "Sex between :SexMin to :SexMax";
                break;
            case StringContains:
                sql = "Sex like '%:Sex%'";
                break;
            case Equal:
                sql = "Sex=:Sex";
                break;
            case GreaterEqual:
                sql = "Sex>=:Sex";
                break;
            case GreaterThan:
                sql = "Sex>:Sex";
                break;
            case LessEqual:
                sql = "Sex<=:Sex";
                break;
            case LessThan:
                sql = "Sex<=:Sex";
                break;
            case In:
                sql = "Sex in(" + String.join(",", (CharSequence) this.SexList) + ")";
                break;
            case StringIn:
                sql = "Sex in('" + String.join("','", (CharSequence) this.SexList) + "')";
                break;
        }
        return sql;
    }

    private java.sql.Date Birthday;

    public void setBirthday(java.sql.Date Birthdayvalue) {
        this.Birthday = Birthdayvalue;
    }

    public java.sql.Date getBirthday() {
        return this.Birthday;
    }

    private List<java.sql.Date> BirthdayList;

    public void setBirthdayList(List<java.sql.Date> Birthdayvalue) {
        this.BirthdayList = Birthdayvalue;
    }

    public List<java.sql.Date> getBirthdayList() {
        return this.BirthdayList;
    }

    private java.sql.Date BirthdayMax;

    public void setBirthdayMax(java.sql.Date Birthdayvalue) {
        this.BirthdayMax = Birthdayvalue;
    }

    public java.sql.Date getBirthdayMax() {
        return this.BirthdayMax;
    }

    private java.sql.Date BirthdayMin;

    public void setBirthdayMin(java.sql.Date Birthdayvalue) {
        this.BirthdayMin = Birthdayvalue;
    }

    public java.sql.Date getBirthdayMin() {
        return this.BirthdayMin;
    }

    public void setBirthday(java.sql.Date max, java.sql.Date min) {
        this.BirthdayMax = max;
        this.BirthdayMin = min;
        this.BirthdayPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType BirthdayPOT;

    public void SetBirthday(java.sql.Date info, PamaterOperationType pot) {
        this.Birthday = info;
        this.BirthdayPOT = pot;
    }

    private String GetBirthdaySqlForSharp() {
        String sql = "";
        switch (BirthdayPOT) {
            case Between:
                sql = "Birthday between :BirthdayMin to :BirthdayMax";
                break;
            case StringContains:
                sql = "Birthday like '%:Birthday%'";
                break;
            case Equal:
                sql = "Birthday=:Birthday";
                break;
            case GreaterEqual:
                sql = "Birthday>=:Birthday";
                break;
            case GreaterThan:
                sql = "Birthday>:Birthday";
                break;
            case LessEqual:
                sql = "Birthday<=:Birthday";
                break;
            case LessThan:
                sql = "Birthday<=:Birthday";
                break;
            case In:
                sql = "Birthday in(" + String.join(",", (CharSequence) this.BirthdayList) + ")";
                break;
            case StringIn:
                sql = "Birthday in('" + String.join("','", (CharSequence) this.BirthdayList) + "')";
                break;
        }
        return sql;
    }

    private String ID;

    public void setID(String IDvalue) {
        this.ID = IDvalue;
    }

    public String getID() {
        return this.ID;
    }

    private List<String> IDList;

    public void setIDList(List<String> IDvalue) {
        this.IDList = IDvalue;
    }

    public List<String> getIDList() {
        return this.IDList;
    }

    private PamaterOperationType IDPOT;

    public void SetID(String info, PamaterOperationType pot) {
        this.ID = info;
        this.IDPOT = pot;
    }

    private String GetIDSqlForSharp() {
        String sql = "";
        switch (IDPOT) {
            case StringContains:
                sql = "ID like '%:ID%'";
                break;
            case Equal:
                sql = "ID=:ID";
                break;
            case GreaterEqual:
                sql = "ID>=:ID";
                break;
            case GreaterThan:
                sql = "ID>:ID";
                break;
            case LessEqual:
                sql = "ID<=:ID";
                break;
            case LessThan:
                sql = "ID<=:ID";
                break;
            case In:
                sql = "ID in(" + String.join(",", (CharSequence) this.IDList) + ")";
                break;
            case StringIn:
                sql = "ID in('" + String.join("','", (CharSequence) this.IDList) + "')";
                break;
        }
        return sql;
    }

    private Boolean IsAI;

    public void setIsAI(Boolean IsAIvalue) {
        this.IsAI = IsAIvalue;
    }

    public Boolean getIsAI() {
        return this.IsAI;
    }

    private List<Boolean> IsAIList;

    public void setIsAIList(List<Boolean> IsAIvalue) {
        this.IsAIList = IsAIvalue;
    }

    public List<Boolean> getIsAIList() {
        return this.IsAIList;
    }

    private Boolean IsAIMax;

    public void setIsAIMax(Boolean IsAIvalue) {
        this.IsAIMax = IsAIvalue;
    }

    public Boolean getIsAIMax() {
        return this.IsAIMax;
    }

    private Boolean IsAIMin;

    public void setIsAIMin(Boolean IsAIvalue) {
        this.IsAIMin = IsAIvalue;
    }

    public Boolean getIsAIMin() {
        return this.IsAIMin;
    }

    public void setIsAI(Boolean max, Boolean min) {
        this.IsAIMax = max;
        this.IsAIMin = min;
        this.IsAIPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType IsAIPOT;

    public void SetIsAI(Boolean info, PamaterOperationType pot) {
        this.IsAI = info;
        this.IsAIPOT = pot;
    }

    private String GetIsAISqlForSharp() {
        String sql = "";
        switch (IsAIPOT) {
            case Between:
                sql = "IsAI between :IsAIMin to :IsAIMax";
                break;
            case StringContains:
                sql = "IsAI like '%:IsAI%'";
                break;
            case Equal:
                sql = "IsAI=:IsAI";
                break;
            case GreaterEqual:
                sql = "IsAI>=:IsAI";
                break;
            case GreaterThan:
                sql = "IsAI>:IsAI";
                break;
            case LessEqual:
                sql = "IsAI<=:IsAI";
                break;
            case LessThan:
                sql = "IsAI<=:IsAI";
                break;
            case In:
                sql = "IsAI in(" + String.join(",", (CharSequence) this.IsAIList) + ")";
                break;
            case StringIn:
                sql = "IsAI in('" + String.join("','", (CharSequence) this.IsAIList) + "')";
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