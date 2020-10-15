package com.kgc.pojo;

import java.util.Date;

public class XiaoXi {
    private Integer xid;

    private Integer chid;

    private Integer zhu;

    private String neirong;

    private Date createdate;

    private Integer xtype;

    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public Integer getChid() {
        return chid;
    }

    public void setChid(Integer chid) {
        this.chid = chid;
    }

    public Integer getZhu() {
        return zhu;
    }

    public void setZhu(Integer zhu) {
        this.zhu = zhu;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getXtype() {
        return xtype;
    }

    public void setXtype(Integer xtype) {
        this.xtype = xtype;
    }
}