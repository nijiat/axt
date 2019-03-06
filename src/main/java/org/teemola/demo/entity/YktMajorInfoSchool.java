package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktMajorInfoSchool implements Serializable {
    private Integer id;

    private String name;

    private Integer courseidschool;

    private Date createtime;

    private Date updatetime;

    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCourseidschool() {
        return courseidschool;
    }

    public void setCourseidschool(Integer courseidschool) {
        this.courseidschool = courseidschool;
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
}