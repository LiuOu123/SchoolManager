package com.kgc.service;


import com.kgc.pojo.*;

import java.util.List;

/**
 * @author shkstart
 */
public interface DhnService {
    //根据账号id查询用户id
    List<UserInfo> seluserid(Integer aid);

    //根据用户userid查班级id
    GradeUser selGradeId(Integer userid);

    //根据班级id查作业
    List<Releasee> selwork(Integer gradeid, Integer Num, Integer pageSize);

    //根据作业id查看回复
    List<Reply> selhuifu(Integer workid, Integer Num, Integer pageSize);

    //提交作业
    int tijiaozuoye(Works works);

    //查询职位
    Position selPosition(Integer pid);

}
