package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.*;
import com.sun.javafx.image.IntPixelGetter;

import java.util.List;

public interface LoService {
    List<Grade> selectByGradeId(int gradeId);
    List<GradeUser> selectByUserId(int userid);
    List<Releasee> select7daycount(int gradeid);//根据班级号 去查找最近7次作业的信息
    List<Works> selectByRelid(int relid);//根据班级号去查
    List<Integer> select7daycountGrade(int gradeid);//根据班级号 去查找最近7天每天同学提交的作业总数量

    List<GradeUser> selectByUserIdd(int userID);//根据用户id查找该用户下有哪些班级
    List<Grade> selectByGid(int gid);//根据id查找班级信息
    int insertReleasee(Releasee releasee);//发布作业
    PageInfo<Releasee> selectByGradeIdd(Integer pageNum,Integer pageSize,int gradeId);//根据班级id查找作业表中相对应的值
    List<Works> selecyByRelId(int id);//根据作业id查找提交信息
    List<UserInfo> selectByAccid(int addid);//根据用户id查找userinfo信息
    int updateWorksIsverify(Works works);//根据works对象修改是否审核
    int insertReply(Reply reply);//插入作业回复
    Releasee selectByRid(int rid);//查询releasee表中rid符合数据的值
}
