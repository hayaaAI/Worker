package hayaa.worker.servicecontroller.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserExtend {
    private Integer personId;
    /**
     * 人员姓名
     */
    private String name;
    private Boolean sex;
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date birthday;
    /**
     * 身份证
     */
    private String id;
    /**
     * AI员工标识
     */
    private Boolean ai;
    private Integer userId;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 人员分组
     */
    private Integer personGroup;
    /**
     * 头像
     */
    private String photo;
    private String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getPersonGroup() {
        return personGroup;
    }

    public void setPersonGroup(Integer personGroup) {
        this.personGroup = personGroup;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


}
