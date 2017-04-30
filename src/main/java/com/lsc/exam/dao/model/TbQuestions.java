package com.lsc.exam.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TbQuestions implements Serializable {
    private Long id;

    private String subject;

    private String type;

    private Date jointime;

    private Integer lessonid;

    private Long taotiid;

    private String optiona;

    private String optionb;

    private String optionc;

    private String optiond;

    private String answer;

    private String note;

    private Integer chapterid;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Integer getLessonid() {
        return lessonid;
    }

    public void setLessonid(Integer lessonid) {
        this.lessonid = lessonid;
    }

    public Long getTaotiid() {
        return taotiid;
    }

    public void setTaotiid(Long taotiid) {
        this.taotiid = taotiid;
    }

    public String getOptiona() {
        return optiona;
    }

    public void setOptiona(String optiona) {
        this.optiona = optiona;
    }

    public String getOptionb() {
        return optionb;
    }

    public void setOptionb(String optionb) {
        this.optionb = optionb;
    }

    public String getOptionc() {
        return optionc;
    }

    public void setOptionc(String optionc) {
        this.optionc = optionc;
    }

    public String getOptiond() {
        return optiond;
    }

    public void setOptiond(String optiond) {
        this.optiond = optiond;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getChapterid() {
        return chapterid;
    }

    public void setChapterid(Integer chapterid) {
        this.chapterid = chapterid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subject=").append(subject);
        sb.append(", type=").append(type);
        sb.append(", jointime=").append(jointime);
        sb.append(", lessonid=").append(lessonid);
        sb.append(", taotiid=").append(taotiid);
        sb.append(", optiona=").append(optiona);
        sb.append(", optionb=").append(optionb);
        sb.append(", optionc=").append(optionc);
        sb.append(", optiond=").append(optiond);
        sb.append(", answer=").append(answer);
        sb.append(", note=").append(note);
        sb.append(", chapterid=").append(chapterid);
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
        TbQuestions other = (TbQuestions) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSubject() == null ? other.getSubject() == null : this.getSubject().equals(other.getSubject()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getJointime() == null ? other.getJointime() == null : this.getJointime().equals(other.getJointime()))
            && (this.getLessonid() == null ? other.getLessonid() == null : this.getLessonid().equals(other.getLessonid()))
            && (this.getTaotiid() == null ? other.getTaotiid() == null : this.getTaotiid().equals(other.getTaotiid()))
            && (this.getOptiona() == null ? other.getOptiona() == null : this.getOptiona().equals(other.getOptiona()))
            && (this.getOptionb() == null ? other.getOptionb() == null : this.getOptionb().equals(other.getOptionb()))
            && (this.getOptionc() == null ? other.getOptionc() == null : this.getOptionc().equals(other.getOptionc()))
            && (this.getOptiond() == null ? other.getOptiond() == null : this.getOptiond().equals(other.getOptiond()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getChapterid() == null ? other.getChapterid() == null : this.getChapterid().equals(other.getChapterid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSubject() == null) ? 0 : getSubject().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getJointime() == null) ? 0 : getJointime().hashCode());
        result = prime * result + ((getLessonid() == null) ? 0 : getLessonid().hashCode());
        result = prime * result + ((getTaotiid() == null) ? 0 : getTaotiid().hashCode());
        result = prime * result + ((getOptiona() == null) ? 0 : getOptiona().hashCode());
        result = prime * result + ((getOptionb() == null) ? 0 : getOptionb().hashCode());
        result = prime * result + ((getOptionc() == null) ? 0 : getOptionc().hashCode());
        result = prime * result + ((getOptiond() == null) ? 0 : getOptiond().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getChapterid() == null) ? 0 : getChapterid().hashCode());
        return result;
    }
}