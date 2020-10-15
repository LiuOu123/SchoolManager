package com.kgc.pojo;

public class Path {
    private Integer pid;

    private Integer worid;

    private String pathname;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getWorid() {
        return worid;
    }

    public void setWorid(Integer worid) {
        this.worid = worid;
    }

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname == null ? null : pathname.trim();
    }
}