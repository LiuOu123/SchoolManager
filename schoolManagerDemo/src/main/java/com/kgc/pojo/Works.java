package com.kgc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Works {
    private Integer wid;

    private Integer gradeid;

    private Integer userid;

    private Integer relid;

    private String wortitle;

    private String wornei;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date wordate;

    private Integer isverify;

    private Grade grade;

    private UserInfo userInfo;

    public Works() {
    }

    public Works(Integer wid, Integer isverify) {
        this.wid = wid;
        this.isverify = isverify;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRelid() {
        return relid;
    }

    public void setRelid(Integer relid) {
        this.relid = relid;
    }

    public String getWortitle() {
        return wortitle;
    }

    public void setWortitle(String wortitle) {
        this.wortitle = wortitle == null ? null : wortitle.trim();
    }

    public String getWornei() {
        return wornei;
    }

    public void setWornei(String wornei) {
        this.wornei = wornei == null ? null : wornei.trim();
    }

    public Date getWordate() {
        return wordate;
    }

    public void setWordate(Date wordate) {
        this.wordate = wordate;
    }

    public Integer getIsverify() {
        return isverify;
    }

    public void setIsverify(Integer isverify) {
        this.isverify = isverify;
    }
}