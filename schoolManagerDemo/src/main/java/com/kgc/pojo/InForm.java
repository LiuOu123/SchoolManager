package com.kgc.pojo;

import java.util.Date;

public class InForm {
    private Integer fid;

    private Integer gradeid;

    private Integer userid;

    private Integer usersid;

    private String informnei;

    private Date createdate;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public String getInformnei() {
        return informnei;
    }

    public void setInformnei(String informnei) {
        this.informnei = informnei == null ? null : informnei.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}