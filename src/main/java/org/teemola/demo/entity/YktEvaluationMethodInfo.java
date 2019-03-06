package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktEvaluationMethodInfo implements Serializable {
    private Integer id;

    private Integer courseidschool;

    private String wayassess;

    private Integer wayassessid;

    private Date createtime;

    private Date updatetime;

    private String remark;

    private Boolean isDeleted;

    private Integer weight;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseidschool() {
        return courseidschool;
    }

    public void setCourseidschool(Integer courseidschool) {
        this.courseidschool = courseidschool;
    }

    public String getWayassess() {
        return wayassess;
    }

    public void setWayassess(String wayassess) {
        this.wayassess = wayassess == null ? null : wayassess.trim();
    }

    public Integer getWayassessid() {
        return wayassessid;
    }

    public void setWayassessid(Integer wayassessid) {
        this.wayassessid = wayassessid;
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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}