package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktPeriodInfo implements Serializable {
    private Integer id;

    private Date year;

    private String term;

    private Date createtime;

    private Date updatetime;

    private Boolean isDeleted;

    private String remark;

    private Integer totalweek;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
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

    public Integer getTotalweek() {
        return totalweek;
    }

    public void setTotalweek(Integer totalweek) {
        this.totalweek = totalweek;
    }
}