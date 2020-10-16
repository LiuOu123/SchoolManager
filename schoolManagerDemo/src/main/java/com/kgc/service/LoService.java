package com.kgc.service;

import com.kgc.pojo.Grade;
import com.kgc.pojo.GradeUser;
import com.kgc.pojo.Releasee;
import com.kgc.pojo.Works;

import java.util.List;

public interface LoService {
    List<Grade> selectByGradeId(int gradeId);
    List<GradeUser> selectByUserId(int userid);
    List<Releasee> select7daycount(int gradeid);//根据班级号 去查找最近7次作业的信息
    List<Works> selectByRelid(int relid);//根据班级号去查
    List<Integer> select7daycountGrade(int gradeid);//根据班级号 去查找最近7天每天同学提交的作业总数量
}