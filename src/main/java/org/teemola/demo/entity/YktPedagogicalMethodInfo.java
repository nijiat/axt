package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktPedagogicalMethodInfo implements Serializable {
    private Integer id;

    private Integer courseidschool;

    private String wayteach;

    private Integer typewayteachid;

    private Date createtime;

    private Date updatetime;

    private String remark;

    private Boolean isDeleted;

    private Integer usetime;

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

    public String getWayteach() {
        return wayteach;
    }

    public void setWayteach(String wayteach) {
        this.wayteach = wayteach == null ? null : wayteach.trim();
    }

    public Integer getTypewayteachid() {
        return typewayteachid;
    }

    public void setTypewayteachid(Integer typewayteachid) {
        this.typewayteachid = typewayteachid;
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

    public Integer getUsetime() {
        return usetime;
    }

    public void setUsetime(Integer usetime) {
        this.usetime = usetime;
    }
}