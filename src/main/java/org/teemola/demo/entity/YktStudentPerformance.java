package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktStudentPerformance implements Serializable {
    private Integer id;

    private Date handsupTime;

    private Integer userid;

    private String isChecked;

    private String accessByTeacher;

    private Date createtime;

    private Date updatetime;

    private Boolean isDeleted;

    private Integer creclassnum;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getHandsupTime() {
        return handsupTime;
    }

    public void setHandsupTime(Date handsupTime) {
        this.handsupTime = handsupTime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked == null ? null : isChecked.trim();
    }

    public String getAccessByTeacher() {
        return accessByTeacher;
    }

    public void setAccessByTeacher(String accessByTeacher) {
        this.accessByTeacher = accessByTeacher == null ? null : accessByTeacher.trim();
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getCreclassnum() {
        return creclassnum;
    }

    public void setCreclassnum(Integer creclassnum) {
        this.creclassnum = creclassnum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}