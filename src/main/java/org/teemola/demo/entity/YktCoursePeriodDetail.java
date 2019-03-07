package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktCoursePeriodDetail implements Serializable {
    private Integer id;

    private Integer courseperiodid;

    private Integer userid;

    private Integer classroomid;

    private Integer classtime;

    private Date classbegin;

    private Date classend;

    private Date createtime;

    private Date updatetime;

    private String remark;

    private Boolean isDeleted;

    private Short theorder;

    private Integer week;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseperiodid() {
        return courseperiodid;
    }

    public void setCourseperiodid(Integer courseperiodid) {
        this.courseperiodid = courseperiodid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    public Integer getClasstime() {
        return classtime;
    }

    public void setClasstime(Integer classtime) {
        this.classtime = classtime;
    }

    public Date getClassbegin() {
        return classbegin;
    }

    public void setClassbegin(Date classbegin) {
        this.classbegin = classbegin;
    }

    public Date getClassend() {
        return classend;
    }

    public void setClassend(Date classend) {
        this.classend = classend;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Short getTheorder() {
        return theorder;
    }

    public void setTheorder(Short theorder) {
        this.theorder = theorder;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }
}