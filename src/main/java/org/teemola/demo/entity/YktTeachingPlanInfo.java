package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktTeachingPlanInfo implements Serializable {
    private Integer id;

    private Integer teachingplanid;

    private Integer courseidcountry;

    private Integer classnum;

    private Integer computernum;

    private Integer testnum;

    private String typecourse;

    private String teacherid;

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

    public Integer getTeachingplanid() {
        return teachingplanid;
    }

    public void setTeachingplanid(Integer teachingplanid) {
        this.teachingplanid = teachingplanid;
    }

    public Integer getCourseidcountry() {
        return courseidcountry;
    }

    public void setCourseidcountry(Integer courseidcountry) {
        this.courseidcountry = courseidcountry;
    }

    public Integer getClassnum() {
        return classnum;
    }

    public void setClassnum(Integer classnum) {
        this.classnum = classnum;
    }

    public Integer getComputernum() {
        return computernum;
    }

    public void setComputernum(Integer computernum) {
        this.computernum = computernum;
    }

    public Integer getTestnum() {
        return testnum;
    }

    public void setTestnum(Integer testnum) {
        this.testnum = testnum;
    }

    public String getTypecourse() {
        return typecourse;
    }

    public void setTypecourse(String typecourse) {
        this.typecourse = typecourse == null ? null : typecourse.trim();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
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