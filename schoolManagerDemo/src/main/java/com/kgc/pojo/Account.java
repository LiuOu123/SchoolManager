package com.kgc.pojo;

import java.util.Date;

public class Account {
    private Integer aid;

    private Integer posid;

    private String accountname;

    private String password;

    private Date createdate;

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", posid=" + posid +
                ", accountname='" + accountname + '\'' +
                ", password='" + password + '\'' +
                ", createdate=" + createdate +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getPosid() {
        return posid;
    }

    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}