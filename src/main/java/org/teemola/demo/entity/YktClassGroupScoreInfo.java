package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktClassGroupScoreInfo implements Serializable {
    private Integer id;

    private Integer topicid;

    private Integer groupid;

    private Integer teachergoal;

    private Integer userid;

    private Integer classcrt;

    private Integer leaderweight;

    private Integer courseperiod;

    private String topiccontent;

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

    public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getTeachergoal() {
        return teachergoal;
    }

    public void setTeachergoal(Integer teachergoal) {
        this.teachergoal = teachergoal;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getClasscrt() {
        return classcrt;
    }

    public void setClasscrt(Integer classcrt) {
        this.classcrt = classcrt;
    }

    public Integer getLeaderweight() {
        return leaderweight;
    }

    public void setLeaderweight(Integer leaderweight) {
        this.leaderweight = leaderweight;
    }

    public Integer getCourseperiod() {
        return courseperiod;
    }

    public void setCourseperiod(Integer courseperiod) {
        this.courseperiod = courseperiod;
    }

    public String getTopiccontent() {
        return topiccontent;
    }

    public void setTopiccontent(String topiccontent) {
        this.topiccontent = topiccontent == null ? null : topiccontent.trim();
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