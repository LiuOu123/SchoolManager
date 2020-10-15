package com.kgc.pojo;

public class Reply {
    private Integer rid;

    private Integer worid;

    private String replynei;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getWorid() {
        return worid;
    }

    public void setWorid(Integer worid) {
        this.worid = worid;
    }

    public String getReplynei() {
        return replynei;
    }

    public void setReplynei(String replynei) {
        this.replynei = replynei == null ? null : replynei.trim();
    }
}