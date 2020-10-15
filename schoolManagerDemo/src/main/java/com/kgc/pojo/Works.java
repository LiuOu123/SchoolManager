package com.kgc.pojo;

import java.util.Date;

public class Works {
    private Integer wid;

    private Integer gradeid;

    private Integer userid;

    private Integer relid;

    private String wortitle;

    private String wornei;

    private Date wordate;

    private Integer isverify;

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