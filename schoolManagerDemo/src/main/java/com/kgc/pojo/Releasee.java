package com.kgc.pojo;

import java.util.Date;

public class Releasee {
    private Integer rid;

    private Integer gradeid;

    private String reltitle;

    private String relnei;

    private Date reldate;

    private Grade grade;

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public String getReltitle() {
        return reltitle;
    }

    public void setReltitle(String reltitle) {
        this.reltitle = reltitle == null ? null : reltitle.trim();
    }

    public String getRelnei() {
        return relnei;
    }

    public void setRelnei(String relnei) {
        this.relnei = relnei == null ? null : relnei.trim();
    }

    public Date getReldate() {
        return reldate;
    }

    public void setReldate(Date reldate) {
        this.reldate = reldate;
    }

    @Override
    public String toString() {
        return "Releasee{" +
                "rid=" + rid +
                ", gradeid=" + gradeid +
                ", reltitle='" + reltitle + '\'' +
                ", relnei='" + relnei + '\'' +
                ", reldate=" + reldate +
                '}';
    }
}