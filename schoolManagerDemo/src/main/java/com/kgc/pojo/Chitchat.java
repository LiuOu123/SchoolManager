package com.kgc.pojo;

import java.util.List;

public class Chitchat {
    private Integer chid;

    private Integer userid;

    private Integer haoid;

    private String beizhu;

    private List<XiaoXi> xiaoXis;
    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "Chitchat{" +
                "chid=" + chid +
                ", userid=" + userid +
                ", haoid=" + haoid +
                ", beizhu='" + beizhu + '\'' +
                ", xiaoXis=" + xiaoXis +
                '}';
    }

    public List<XiaoXi> getXiaoXis() {
        return xiaoXis;
    }

    public void setXiaoXis(List<XiaoXi> xiaoXis) {
        this.xiaoXis = xiaoXis;
    }

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