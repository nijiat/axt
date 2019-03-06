package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktMemberScoreInfo implements Serializable {
    private Integer id;

    private Integer userid;

    private String topickey;

    private Integer leadergoal;

    private Integer groupid;

    private Integer topicid;

    private Byte isleader;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTopickey() {
        return topickey;
    }

    public void setTopickey(String topickey) {
        this.topickey = topickey == null ? null : topickey.trim();
    }

    public Integer getLeadergoal() {
        return leadergoal;
    }

    public void setLeadergoal(Integer leadergoal) {
        this.leadergoal = leadergoal;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    public Byte getIsleader() {
        return isleader;
    }

    public void setIsleader(Byte isleader) {
        this.isleader = isleader;
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