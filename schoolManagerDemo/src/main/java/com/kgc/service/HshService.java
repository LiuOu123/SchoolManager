package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Account;
import com.kgc.pojo.Grade;
import com.kgc.pojo.GradeUser;
import com.kgc.pojo.UserInfo;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-17 11:32
 */
public interface HshService {
    Grade hshGrade();
    List<Grade> hshList();
    PageInfo<UserInfo> selfenye(Integer pageIndex, int pageSize, Integer accid, String name, Integer utype);
    //根据gradeid查询userid

    List<GradeUser> hshselg(Integer gradeid);
    //查询个人信息
    UserInfo hshselect(int aid, int tid);
    //修改个人信息
    int hshupdate(UserInfo userinfo);
    //根据aid修改可见状态
    int hshupdz(Integer accid, Integer utype);
    int hshins(UserInfo userInfo);

    //查询总人数
    List<UserInfo> hshsunm();
    //添加学生基本信息
    int hshins2(UserInfo userInfo);
    //添加学生账号
    int hshaccount(Account account);
    //添加学生和班级关联
    int hshgradeuser(GradeUser gradeUser);

    Account accsel(String accountname);
}
