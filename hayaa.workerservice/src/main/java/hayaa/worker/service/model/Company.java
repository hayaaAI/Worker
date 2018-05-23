package hayaa.worker.service.model;

import hayaa.basemodel.model.BaseData;

import java.io.Serializable;
import java.util.Date;

public class Company extends BaseData implements Serializable {
    private Integer companyId;
    private String companyCode;
    private String companyFullName;
    private String companyName;
    private Date birdthday;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getBirdthday() {
        return birdthday;
    }

    public void setBirdthday(Date birdthday) {
        this.birdthday = birdthday;
    }


}
