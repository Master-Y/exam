package com.lsc.exam.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TbTaoti implements Serializable {
    private Long id;

    private String name;

    private Long lessonid;

    private Date jointime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLessonid() {
        return lessonid;
    }

    public void setLessonid(Long lessonid) {
        this.lessonid = lessonid;
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
        sb.append(", name=").append(name);
        sb.append(", lessonid=").append(lessonid);
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
        TbTaoti other = (TbTaoti) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getLessonid() == null ? other.getLessonid() == null : this.getLessonid().equals(other.getLessonid()))
            && (this.getJointime() == null ? other.getJointime() == null : this.getJointime().equals(other.getJointime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getLessonid() == null) ? 0 : getLessonid().hashCode());
        result = prime * result + ((getJointime() == null) ? 0 : getJointime().hashCode());
        return result;
    }
}