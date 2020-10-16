package com.kgc.controller;

import com.kgc.pojo.Grade;
import com.kgc.pojo.GradeUser;
import com.kgc.pojo.Releasee;
import com.kgc.service.LoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoTeacherHomeController {

    @Resource
    LoService loService;
    @RequestMapping("/sevenday")
    /*@ResponseBody*/
    public String sevenday(Model model, int aid, HttpSession session) {
        List<GradeUser> gradeUsers = loService.selectByUserId(aid);//根据用户id查找 管理那个班级
        List<Grade> banList=new ArrayList<Grade>();
        for(int j=0;j<gradeUsers.size();j++){
            List<Grade> grades = loService.selectByGradeId(gradeUsers.get(j).getGradeid());//通过班级id查找班级名字
            banList.add(grades.get(0));
        }
        session.setAttribute("banList",banList);
        //查询最近七次作业提交情况
        List<Integer> sum = new ArrayList<>();
        List<Releasee> releasees = loService.select7daycount(gradeUsers.get(0).getGradeid());

        for (int j = 0; j < releasees.size(); j++) {
            sum.add(loService.selectByRelid(releasees.get(j).getRid()).size());//查找该次作业有几名同学提交
        }
        if(sum.size()<6){
            for(int i=0;i<sum.size();i++){
                session.setAttribute("ci"+(i+1)+"", sum.get(sum.size()-1));
            }
        }else{
            session.setAttribute("ci1", sum.get(6));
            session.setAttribute("ci2", sum.get(5));
            session.setAttribute("ci3", sum.get(4));
            session.setAttribute("ci4", sum.get(3));
            session.setAttribute("ci5", sum.get(2));
            session.setAttribute("ci6", sum.get(1));
            session.setAttribute("ci7", sum.get(0));
        }
        System.out.println("sum:" + sum.toString());
        return "/ttongji";
    }
    @RequestMapping("/sevendaybancha")
    /*@ResponseBody*/
    public String sevendaybancha(Model model, int aid,String baneName, HttpSession session) {
        List<GradeUser> gradeUsers = loService.selectByUserId(aid);//根据用户id查找 管理那个班级
        List<Grade> banList=new ArrayList<Grade>();
        for(int j=0;j<gradeUsers.size();j++){
            List<Grade> grades = loService.selectByGradeId(gradeUsers.get(j).getGradeid());//通过班级id查找班级名字
            banList.add(grades.get(0));
        }
        session.setAttribute("banList",banList);
        //查询最近七次作业提交情况
        List<Integer> sum = new ArrayList<>();
        List<Releasee> releasees = loService.select7daycount(gradeUsers.get(0).getGradeid());

        for (int j = 0; j < releasees.size(); j++) {
            sum.add(loService.selectByRelid(releasees.get(j).getRid()).size());//查找该次作业有几名同学提交
        }
        if(sum.size()<6){
            for(int i=0;i<sum.size();i++){
                session.setAttribute("ci"+(i+1)+"", sum.get(sum.size()-1));
            }
        }else{
            session.setAttribute("ci1", sum.get(6));
            session.setAttribute("ci2", sum.get(5));
            session.setAttribute("ci3", sum.get(4));
            session.setAttribute("ci4", sum.get(3));
            session.setAttribute("ci5", sum.get(2));
            session.setAttribute("ci6", sum.get(1));
            session.setAttribute("ci7", sum.get(0));
        }
        System.out.println("sum:" + sum.toString());
        return "/ttongji";
    }
}