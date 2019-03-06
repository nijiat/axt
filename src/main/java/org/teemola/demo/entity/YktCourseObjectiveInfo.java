package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktCourseObjectiveInfo implements Serializable {
    private Integer id;

    private Integer courseidschool;

    private String coursegoal;

    private Integer typecoursegoalid;

    private Date createtime;

    private Date updatetime;

    private String remark;

    private Boolean isDeleted;

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

    public String getCoursegoal() {
        return coursegoal;
    }

    public void setCoursegoal(String coursegoal) {
        this.coursegoal = coursegoal == null ? null : coursegoal.trim();
    }

    public Integer getTypecoursegoalid() {
        return typecoursegoalid;
    }

    public void setTypecoursegoalid(Integer typecoursegoalid) {
        this.typecoursegoalid = typecoursegoalid;
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
}