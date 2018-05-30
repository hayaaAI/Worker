package hayaa.worker.service.model;

import hayaa.basemodel.model.BaseData;

import java.util.Date;

public class User extends BaseData {
    private Integer UserId;
    private String NickName;
    private Integer PersonId;
    private Integer PersonGroup;
    private String Photo;

    public void setUserId(Integer UserIdvalue) {
        this.UserId = UserIdvalue;
    }

    public Integer getUserId() {
        return this.UserId;
    }


    public void setNickName(String NickNamevalue) {
        this.NickName = NickNamevalue;
    }

    public String getNickName() {
        return this.NickName;
    }


    public void setPersonId(Integer PersonIdvalue) {
        this.PersonId = PersonIdvalue;
    }

    public Integer getPersonId() {
        return this.PersonId;
    }


    public void setPersonGroup(Integer PersonGroupvalue) {
        this.PersonGroup = PersonGroupvalue;
    }

    public Integer getPersonGroup() {
        return this.PersonGroup;
    }


    public void setPhoto(String Photovalue) {
        this.Photo = Photovalue;
    }

    public String getPhoto() {
        return this.Photo;
    }
}