package com.kgc.pojo;

public class Chitchat {
    private Integer chid;

    private Integer userid;

    private Integer haoid;

    private String beizhu;

    public Integer getChid() {
        return chid;
    }

    public void setChid(Integer chid) {
        this.chid = chid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getHaoid() {
        return haoid;
    }

    public void setHaoid(Integer haoid) {
        this.haoid = haoid;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}