package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktDevicesType implements Serializable {
    private Integer id;

    private String name;

    private Integer code;

    private Short theorder;

    private String typemachine;

    private Integer typemachineid;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Short getTheorder() {
        return theorder;
    }

    public void setTheorder(Short theorder) {
        this.theorder = theorder;
    }

    public String getTypemachine() {
        return typemachine;
    }

    public void setTypemachine(String typemachine) {
        this.typemachine = typemachine == null ? null : typemachine.trim();
    }

    public Integer getTypemachineid() {
        return typemachineid;
    }

    public void setTypemachineid(Integer typemachineid) {
        this.typemachineid = typemachineid;
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