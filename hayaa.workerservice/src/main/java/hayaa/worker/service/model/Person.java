package hayaa.worker.service.model;

import hayaa.basemodel.model.BaseData;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Person extends BaseData {
    private Integer PersonId;
    private String Name;
    private Boolean Sex;
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date Birthday;
    private String id;
    private Boolean ai;

    public void setPersonId(Integer PersonIdvalue) {
        this.PersonId = PersonIdvalue;
    }

    public Integer getPersonId() {
        return this.PersonId;
    }



    public void setName(String Namevalue) {
        this.Name = Namevalue;
    }

    public String getName() {
        return this.Name;
    }



    public void setSex(Boolean Sexvalue) {
        this.Sex = Sexvalue;
    }

    public Boolean getSex() {
        return this.Sex;
    }


    public void setBirthday(Date Birthdayvalue) {
        this.Birthday = Birthdayvalue;
    }

    public Date getBirthday() {
        return this.Birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




    public Boolean getAi() {
        return ai;
    }

    public void setAi(Boolean ai) {
        this.ai = ai;
    }


}