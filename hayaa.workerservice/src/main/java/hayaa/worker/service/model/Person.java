package hayaa.worker.service.model;

import hayaa.basemodel.model.BaseData;

public class Person extends BaseData {
    private Integer PersonId;

    public void setPersonId(Integer PersonIdvalue) {
        this.PersonId = PersonIdvalue;
    }

    public Integer getPersonId() {
        return this.PersonId;
    }

    private String Name;

    public void setName(String Namevalue) {
        this.Name = Namevalue;
    }

    public String getName() {
        return this.Name;
    }

    private Boolean Sex;

    public void setSex(Boolean Sexvalue) {
        this.Sex = Sexvalue;
    }

    public Boolean getSex() {
        return this.Sex;
    }

    private java.sql.Date Birthday;

    public void setBirthday(java.sql.Date Birthdayvalue) {
        this.Birthday = Birthdayvalue;
    }

    public java.sql.Date getBirthday() {
        return this.Birthday;
    }

    private String ID;

    public void setID(String IDvalue) {
        this.ID = IDvalue;
    }

    public String getID() {
        return this.ID;
    }

    private Boolean IsAI;

    public void setIsAI(Boolean IsAIvalue) {
        this.IsAI = IsAIvalue;
    }

    public Boolean getIsAI() {
        return this.IsAI;
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