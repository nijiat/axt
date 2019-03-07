package org.teemola.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YktTeachingCalendarInfo implements Serializable {
    private Integer id;

    private Integer chapterid;

    private String maincontent;

    private String maingoal;

    private Short maintime;

    private Short numclass;

    private String wayteach;

    private String wayjudge;

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

    public Integer getChapterid() {
        return chapterid;
    }

    public void setChapterid(Integer chapterid) {
        this.chapterid = chapterid;
    }

    public String getMaincontent() {
        return maincontent;
    }

    public void setMaincontent(String maincontent) {
        this.maincontent = maincontent == null ? null : maincontent.trim();
    }

    public String getMaingoal() {
        return maingoal;
    }

    public void setMaingoal(String maingoal) {
        this.maingoal = maingoal == null ? null : maingoal.trim();
    }

    public Short getMaintime() {
        return maintime;
    }

    public void setMaintime(Short maintime) {
        this.maintime = maintime;
    }

    public Short getNumclass() {
        return numclass;
    }

    public void setNumclass(Short numclass) {
        this.numclass = numclass;
    }

    public String getWayteach() {
        return wayteach;
    }

    public void setWayteach(String wayteach) {
        this.wayteach = wayteach == null ? null : wayteach.trim();
    }

    public String getWayjudge() {
        return wayjudge;
    }

    public void setWayjudge(String wayjudge) {
        this.wayjudge = wayjudge == null ? null : wayjudge.trim();
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