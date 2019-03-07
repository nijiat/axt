package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktStudentDutyInfo implements Serializable {
    private Integer id;

    private Integer userid;

    private Boolean issign;

    private Date signtime;

    private Integer state;

    private Date createtime;

    private Date updatetime;

    private Integer classdetailid;

    private Boolean isDeleted;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Boolean getIssign() {
        return issign;
    }

    public void setIssign(Boolean issign) {
        this.issign = issign;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getClassdetailid() {
        return classdetailid;
    }

    public void setClassdetailid(Integer classdetailid) {
        this.classdetailid = classdetailid;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}