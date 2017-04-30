package com.lsc.exam.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TbSturesult implements Serializable {
    private Long id;

    private String stuid;

    private String whichlesson;

    private Integer ressingle;

    private Integer resmore;

    private String restotal;

    private Date jointime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getWhichlesson() {
        return whichlesson;
    }

    public void setWhichlesson(String whichlesson) {
        this.whichlesson = whichlesson;
    }

    public Integer getRessingle() {
        return ressingle;
    }

    public void setRessingle(Integer ressingle) {
        this.ressingle = ressingle;
    }

    public Integer getResmore() {
        return resmore;
    }

    public void setResmore(Integer resmore) {
        this.resmore = resmore;
    }

    public String getRestotal() {
        return restotal;
    }

    public void setRestotal(String restotal) {
        this.restotal = restotal;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stuid=").append(stuid);
        sb.append(", whichlesson=").append(whichlesson);
        sb.append(", ressingle=").append(ressingle);
        sb.append(", resmore=").append(resmore);
        sb.append(", restotal=").append(restotal);
        sb.append(", jointime=").append(jointime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbSturesult other = (TbSturesult) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStuid() == null ? other.getStuid() == null : this.getStuid().equals(other.getStuid()))
            && (this.getWhichlesson() == null ? other.getWhichlesson() == null : this.getWhichlesson().equals(other.getWhichlesson()))
            && (this.getRessingle() == null ? other.getRessingle() == null : this.getRessingle().equals(other.getRessingle()))
            && (this.getResmore() == null ? other.getResmore() == null : this.getResmore().equals(other.getResmore()))
            && (this.getRestotal() == null ? other.getRestotal() == null : this.getRestotal().equals(other.getRestotal()))
            && (this.getJointime() == null ? other.getJointime() == null : this.getJointime().equals(other.getJointime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStuid() == null) ? 0 : getStuid().hashCode());
        result = prime * result + ((getWhichlesson() == null) ? 0 : getWhichlesson().hashCode());
        result = prime * result + ((getRessingle() == null) ? 0 : getRessingle().hashCode());
        result = prime * result + ((getResmore() == null) ? 0 : getResmore().hashCode());
        result = prime * result + ((getRestotal() == null) ? 0 : getRestotal().hashCode());
        result = prime * result + ((getJointime() == null) ? 0 : getJointime().hashCode());
        return result;
    }
}