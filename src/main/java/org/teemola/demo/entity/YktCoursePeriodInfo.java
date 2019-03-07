package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktCoursePeriodInfo implements Serializable {
    private Integer id;

    private Integer termid;

    private Integer courseperiodid;

    private Integer courseidschool;

    private String uid;

    private String courseperiodname;

    private Date createtime;

    private Date updatetime;

    private Boolean isDeleted;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTermid() {
        return termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    public Integer getCourseperiodid() {
        return courseperiodid;
    }

    public void setCourseperiodid(Integer courseperiodid) {
        this.courseperiodid = courseperiodid;
    }

    public Integer getCourseidschool() {
        return courseidschool;
    }

    public void setCourseidschool(Integer courseidschool) {
        this.courseidschool = courseidschool;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getCourseperiodname() {
        return courseperiodname;
    }

    public void setCourseperiodname(String courseperiodname) {
        this.courseperiodname = courseperiodname == null ? null : courseperiodname.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}