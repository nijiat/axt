package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktCourseChapterInfo implements Serializable {
    private Integer id;

    private Integer schoolcourseid;

    private String name;

    private String code;

    private Date createtime;

    private Date updatetime;

    private Boolean isDeleted;

    private Integer childnum;

    private Boolean isLeaf;

    private Short theorder;

    private Short thelevel;

    private Integer parentid;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolcourseid() {
        return schoolcourseid;
    }

    public void setSchoolcourseid(Integer schoolcourseid) {
        this.schoolcourseid = schoolcourseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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

    public Integer getChildnum() {
        return childnum;
    }

    public void setChildnum(Integer childnum) {
        this.childnum = childnum;
    }

    public Boolean getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Short getTheorder() {
        return theorder;
    }

    public void setTheorder(Short theorder) {
        this.theorder = theorder;
    }

    public Short getThelevel() {
        return thelevel;
    }

    public void setThelevel(Short thelevel) {
        this.thelevel = thelevel;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}