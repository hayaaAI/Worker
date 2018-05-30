package hayaa.worker.service.model;

import hayaa.basemodel.model.PamaterOperationType;
import hayaa.basemodel.model.BaseData;
import hayaa.basemodel.model.SearchPamaterMariadbBase;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserSearchPamater extends SearchPamaterMariadbBase {
    private Integer UserId;

    public void setUserId(Integer UserIdvalue) {
        this.UserId = UserIdvalue;
    }

    public Integer getUserId() {
        return this.UserId;
    }

    private List<Integer> UserIdList;

    public void setUserIdList(List<Integer> UserIdvalue) {
        this.UserIdList = UserIdvalue;
    }

    public List<Integer> getUserIdList() {
        return this.UserIdList;
    }

    private Integer UserIdMax;

    public void setUserIdMax(Integer UserIdvalue) {
        this.UserIdMax = UserIdvalue;
    }

    public Integer getUserIdMax() {
        return this.UserIdMax;
    }

    private Integer UserIdMin;

    public void setUserIdMin(Integer UserIdvalue) {
        this.UserIdMin = UserIdvalue;
    }

    public Integer getUserIdMin() {
        return this.UserIdMin;
    }

    public void setUserId(Integer max, Integer min) {
        this.UserIdMax = max;
        this.UserIdMin = min;
        this.UserIdPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType UserIdPOT;

    public void SetUserId(Integer info, PamaterOperationType pot) {
        this.UserId = info;
        this.UserIdPOT = pot;
    }

    private String GetUserIdSqlForSharp() {
        String sql = "";
        switch (UserIdPOT) {
            case Between:
                sql = "UserId between :UserIdMin to :UserIdMax";
                break;
            case StringContains:
                sql = "UserId like '%:UserId%'";
                break;
            case Equal:
                sql = "UserId=:UserId";
                break;
            case GreaterEqual:
                sql = "UserId>=:UserId";
                break;
            case GreaterThan:
                sql = "UserId>:UserId";
                break;
            case LessEqual:
                sql = "UserId<=:UserId";
                break;
            case LessThan:
                sql = "UserId<=:UserId";
                break;
            case In:
                sql = "UserId in(" + String.join(",", (CharSequence) this.UserIdList) + ")";
                break;
            case StringIn:
                sql = "UserId in('" + String.join("','", (CharSequence) this.UserIdList) + "')";
                break;
        }
        return sql;
    }

    private String NickName;

    public void setNickName(String NickNamevalue) {
        this.NickName = NickNamevalue;
    }

    public String getNickName() {
        return this.NickName;
    }

    private List<String> NickNameList;

    public void setNickNameList(List<String> NickNamevalue) {
        this.NickNameList = NickNamevalue;
    }

    public List<String> getNickNameList() {
        return this.NickNameList;
    }

    private PamaterOperationType NickNamePOT;

    public void SetNickName(String info, PamaterOperationType pot) {
        this.NickName = info;
        this.NickNamePOT = pot;
    }

    private String GetNickNameSqlForSharp() {
        String sql = "";
        switch (NickNamePOT) {
            case StringContains:
                sql = "NickName like '%:NickName%'";
                break;
            case Equal:
                sql = "NickName=:NickName";
                break;
            case GreaterEqual:
                sql = "NickName>=:NickName";
                break;
            case GreaterThan:
                sql = "NickName>:NickName";
                break;
            case LessEqual:
                sql = "NickName<=:NickName";
                break;
            case LessThan:
                sql = "NickName<=:NickName";
                break;
            case In:
                sql = "NickName in(" + String.join(",", (CharSequence) this.NickNameList) + ")";
                break;
            case StringIn:
                sql = "NickName in('" + String.join("','", (CharSequence) this.NickNameList) + "')";
                break;
        }
        return sql;
    }

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

    private Integer PersonGroup;

    public void setPersonGroup(Integer PersonGroupvalue) {
        this.PersonGroup = PersonGroupvalue;
    }

    public Integer getPersonGroup() {
        return this.PersonGroup;
    }

    private List<Integer> PersonGroupList;

    public void setPersonGroupList(List<Integer> PersonGroupvalue) {
        this.PersonGroupList = PersonGroupvalue;
    }

    public List<Integer> getPersonGroupList() {
        return this.PersonGroupList;
    }

    private Integer PersonGroupMax;

    public void setPersonGroupMax(Integer PersonGroupvalue) {
        this.PersonGroupMax = PersonGroupvalue;
    }

    public Integer getPersonGroupMax() {
        return this.PersonGroupMax;
    }

    private Integer PersonGroupMin;

    public void setPersonGroupMin(Integer PersonGroupvalue) {
        this.PersonGroupMin = PersonGroupvalue;
    }

    public Integer getPersonGroupMin() {
        return this.PersonGroupMin;
    }

    public void setPersonGroup(Integer max, Integer min) {
        this.PersonGroupMax = max;
        this.PersonGroupMin = min;
        this.PersonGroupPOT = PamaterOperationType.Between;
    }

    private PamaterOperationType PersonGroupPOT;

    public void SetPersonGroup(Integer info, PamaterOperationType pot) {
        this.PersonGroup = info;
        this.PersonGroupPOT = pot;
    }

    private String GetPersonGroupSqlForSharp() {
        String sql = "";
        switch (PersonGroupPOT) {
            case Between:
                sql = "PersonGroup between :PersonGroupMin to :PersonGroupMax";
                break;
            case StringContains:
                sql = "PersonGroup like '%:PersonGroup%'";
                break;
            case Equal:
                sql = "PersonGroup=:PersonGroup";
                break;
            case GreaterEqual:
                sql = "PersonGroup>=:PersonGroup";
                break;
            case GreaterThan:
                sql = "PersonGroup>:PersonGroup";
                break;
            case LessEqual:
                sql = "PersonGroup<=:PersonGroup";
                break;
            case LessThan:
                sql = "PersonGroup<=:PersonGroup";
                break;
            case In:
                sql = "PersonGroup in(" + String.join(",", (CharSequence) this.PersonGroupList) + ")";
                break;
            case StringIn:
                sql = "PersonGroup in('" + String.join("','", (CharSequence) this.PersonGroupList) + "')";
                break;
        }
        return sql;
    }

    private String Photo;

    public void setPhoto(String Photovalue) {
        this.Photo = Photovalue;
    }

    public String getPhoto() {
        return this.Photo;
    }

    private List<String> PhotoList;

    public void setPhotoList(List<String> Photovalue) {
        this.PhotoList = Photovalue;
    }

    public List<String> getPhotoList() {
        return this.PhotoList;
    }

    private PamaterOperationType PhotoPOT;

    public void SetPhoto(String info, PamaterOperationType pot) {
        this.Photo = info;
        this.PhotoPOT = pot;
    }

    private String GetPhotoSqlForSharp() {
        String sql = "";
        switch (PhotoPOT) {
            case StringContains:
                sql = "Photo like '%:Photo%'";
                break;
            case Equal:
                sql = "Photo=:Photo";
                break;
            case GreaterEqual:
                sql = "Photo>=:Photo";
                break;
            case GreaterThan:
                sql = "Photo>:Photo";
                break;
            case LessEqual:
                sql = "Photo<=:Photo";
                break;
            case LessThan:
                sql = "Photo<=:Photo";
                break;
            case In:
                sql = "Photo in(" + String.join(",", (CharSequence) this.PhotoList) + ")";
                break;
            case StringIn:
                sql = "Photo in('" + String.join("','", (CharSequence) this.PhotoList) + "')";
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