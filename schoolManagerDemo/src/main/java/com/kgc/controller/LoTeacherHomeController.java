package com.kgc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.mapper.ReplyMapper;
import com.kgc.pojo.*;
import com.kgc.service.LoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class LoTeacherHomeController {

    @Resource
    LoService loService;

    @RequestMapping("/sevenday")
    /*@ResponseBody*/
    public String sevenday(Model model, int aid, HttpSession session) {
        List<GradeUser> gradeUsers = loService.selectByUserId(aid);//根据用户id查找 管理那个班级
        List<Grade> banList = new ArrayList<Grade>();
        for (int j = 0; j < gradeUsers.size(); j++) {
            List<Grade> grades = loService.selectByGradeId(gradeUsers.get(j).getGradeid());//通过班级id查找班级名字
            banList.add(grades.get(0));
        }
        session.setAttribute("banList", banList);
        //查询最近七次作业提交情况
        List<Integer> sum = new ArrayList<>();
        List<Releasee> releasees = loService.select7daycount(gradeUsers.get(0).getGradeid());

        for (int j = 0; j < releasees.size(); j++) {
            sum.add(loService.selectByRelid(releasees.get(j).getRid()).size());//查找该次作业有几名同学提交
        }
        if (sum.size() < 6) {
            for (int i = 0; i < sum.size(); i++) {
                session.setAttribute("ci" + (i + 1) + "", sum.get(sum.size() - 1));
            }
        } else {
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
    public String sevendaybancha(Model model, int aid, String baneName, HttpSession session) {
        List<GradeUser> gradeUsers = loService.selectByUserId(aid);//根据用户id查找 管理那个班级
        List<Grade> banList = new ArrayList<Grade>();
        for (int j = 0; j < gradeUsers.size(); j++) {
            List<Grade> grades = loService.selectByGradeId(gradeUsers.get(j).getGradeid());//通过班级id查找班级名字
            banList.add(grades.get(0));
        }
        session.setAttribute("banList", banList);
        //查询最近七次作业提交情况
        List<Integer> sum = new ArrayList<>();
        List<Releasee> releasees = loService.select7daycount(gradeUsers.get(0).getGradeid());

        for (int j = 0; j < releasees.size(); j++) {
            sum.add(loService.selectByRelid(releasees.get(j).getRid()).size());//查找该次作业有几名同学提交
        }
        if (sum.size() < 6) {
            for (int i = 0; i < sum.size(); i++) {
                session.setAttribute("ci" + (i + 1) + "", sum.get(sum.size() - 1));
            }
        } else {
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

    @RequestMapping("/addHomeWork")//发布作业
    @ResponseBody
    public Map<String, Object> addHomeWork(HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        int userid = (int) session.getAttribute("aid");
        List<GradeUser> gradeUsers = loService.selectByUserIdd(userid);//根据用户id查找名下有多少个班级
        List<Grade> grades = new ArrayList<>();
        for (int i = 0; i < gradeUsers.size(); i++) {
            List<Grade> grades1 = loService.selectByGid(gradeUsers.get(i).getGradeid());
            grades.add(grades1.get(grades1.size() - 1));
        }
        map.put("data", grades);
        return map;
    }

    @RequestMapping("/addHomeWorkOver")
    @ResponseBody
    public Map<String, Object> addHomeWorkOver(Releasee releasee) {
        Map<String, Object> map = new HashMap<>();
        releasee.setReldate(new Date());
        int i = loService.insertReleasee(releasee);
        if (i > 0) {
            map.put("status", "true");
        } else {
            map.put("status", "false");
        }
        return map;
    }

    @RequestMapping("/teacherChaHomeWork")
    @ResponseBody
    public Map<String, Object> TeacherChaHomeWord(HttpSession session, Integer pageNum, Integer pageSize) {
        System.out.println("pageNum" + pageNum);
        System.out.println("pageSize" + pageSize);

        Map<String, Object> map = new HashMap<>();
        int aid = (int) session.getAttribute("aid");

        List<GradeUser> gradeUsers = loService.selectByUserIdd(aid);//根据id查找名下有多少个班级

        List<Releasee> releaseesZong = new ArrayList<>();
        PageInfo<Releasee> releaseePageInfo = null;
        for (int i = 0; i < gradeUsers.size(); i++) {
            releaseePageInfo = loService.selectByGradeIdd(pageNum, pageSize, gradeUsers.get(i).getGradeid());
            for (int j = 0; j < releaseePageInfo.getList().size(); j++) {
                releaseesZong.add(releaseePageInfo.getList().get(j));
            }
        }

        map.put("data", releaseePageInfo);
        return map;
    }

    @RequestMapping("/chuanRelid")//将布置的作业id传过来 将该值赋值到session作用域 为了给chaHomeWorkXiang取值用
    @ResponseBody
    public Map<String, Object> chuanRelid(int relid, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        session.setAttribute("relid", relid);
        return map;
    }

    @RequestMapping("/chaHomeWorkXiang")
    @ResponseBody
    public Map<String, Object> chaHomeWorkXiang(HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        int relid = (int)session.getAttribute("relid");
        List<Works> works = loService.selecyByRelId(relid);
        map.put("data", works);
        return map;
    }
    @RequestMapping("/teacherShenChaHomeWork")
    @ResponseBody
    public Map<String, Object> teacherShenChaHomeWork(int id){
        Map<String, Object> map=new HashMap<>();
        Works works=new Works(id,2);
        int i = loService.updateWorksIsverify(works);
        if(i>0){
            map.put("status","true");
        }else{
            map.put("status","false");
        }
        return map;
    }
    @RequestMapping("/chuanWid")
    @ResponseBody
    public Map<String,Object> chuanWid(int wid,HttpSession session){
        Map<String,Object> map=new HashMap<>();
        session.setAttribute("wid",wid);
        return map;
    }
    @RequestMapping("/teacherAddHuiFu")
    @ResponseBody
    public Map<String,Object> teacherAddHuiFu(String neirong,HttpSession session){
        Map<String,Object> map=new HashMap<>();
        int wid = (int)session.getAttribute("wid");
        Reply reply=new Reply(wid,neirong);
        int i = loService.insertReply(reply);
        if(i>0){
            map.put("status","true");
        }else{
            map.put("status","false");
        }
        return map;
    }

}
