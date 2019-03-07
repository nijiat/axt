package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktExaminationInfo implements Serializable {
    private Integer id;

    private String name;

    private String code;

    private Integer questiontypeid;

    private Integer questionerpersonid;

    private Short thelevel;

    private Date updatetime;

    private Date createtime;

    private Boolean isDeleted;

    private String remark;

    private Integer goal;

    private Integer limitime;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getQuestiontypeid() {
        return questiontypeid;
    }

    public void setQuestiontypeid(Integer questiontypeid) {
        this.questiontypeid = questiontypeid;
    }

    public Integer getQuestionerpersonid() {
        return questionerpersonid;
    }

    public void setQuestionerpersonid(Integer questionerpersonid) {
        this.questionerpersonid = questionerpersonid;
    }

    public Short getThelevel() {
        return thelevel;
    }

    public void setThelevel(Short thelevel) {
        this.thelevel = thelevel;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public Integer getGoal() {
        return goal;
    }

    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    public Integer getLimitime() {
        return limitime;
    }

    public void setLimitime(Integer limitime) {
        this.limitime = limitime;
    }
}