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

    private String worimg;

    private Grade grade;

    private UserInfo userInfo;

    @Override
    public String toString() {
        return "Works{" +
                "wid=" + wid +
                ", gradeid=" + gradeid +
                ", userid=" + userid +
                ", relid=" + relid +
                ", wortitle='" + wortitle + '\'' +
                ", wornei='" + wornei + '\'' +
                ", wordate=" + wordate +
                ", isverify=" + isverify +
                ", worimg='" + worimg + '\'' +
                ", grade=" + grade +
                ", userInfo=" + userInfo +
                '}';
    }

    public Works() {
    }

    public Works(Integer wid, Integer gradeid, Integer userid, Integer relid, String wortitle, String wornei, Date wordate, Integer isverify, String worimg) {
        this.wid = wid;
        this.gradeid = gradeid;
        this.userid = userid;
        this.relid = relid;
        this.wortitle = wortitle;
        this.wornei = wornei;
        this.wordate = wordate;
        this.isverify = isverify;
        this.worimg = worimg;
    }

    public Works(Integer wid, Integer isverify) {
        this.wid = wid;
        this.isverify = isverify;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
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

    public String getWorimg() {
        return worimg;
    }

    public void setWorimg(String worimg) {
        this.worimg = worimg == null ? null : worimg.trim();
    }
}