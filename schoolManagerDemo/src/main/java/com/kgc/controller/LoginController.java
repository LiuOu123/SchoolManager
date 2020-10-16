package com.kgc.controller;

import com.kgc.mapper.AccountMapper;
import com.kgc.mapper.PositionMapper;
import com.kgc.mapper.UserInfoMapper;
import com.kgc.pojo.*;
import com.kgc.service.DhnService;
import com.kgc.service.LoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {
    @Resource
    LoService loService;
    @Resource
    PositionMapper positionMapper;
    @Resource
    AccountMapper accountMapper;
    @Resource
    UserInfoMapper userInfoMapper;

    @RequestMapping("/toLogin")//判断用户登录是否通过,
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/doLogin")//判断用户登录是否通过,
    public String doLogin(Model model, @RequestParam String username, @RequestParam String password, HttpSession session) {
        System.out.println("账号" + username + ";密码" + password);
        AccountExample example = new AccountExample();
        AccountExample.Criteria criteria = example.createCriteria();
        criteria.andAccountnameEqualTo(username);
        List<Account> user = accountMapper.selectByExample(example);
        if (user.size() > 0) {
            for (int i = 0; i < user.size(); i++) {
                if (user.get(i).getPassword().equals(password)) {
                    if (user.get(i).getPosid() == 1) {
                        UserInfoExample uiexample = new UserInfoExample();
                        UserInfoExample.Criteria uicriteria = uiexample.createCriteria();
                        uicriteria.andAccidEqualTo(user.get(i).getAid());
                        List<UserInfo> uiList = userInfoMapper.selectByExample(uiexample);
                        session.setAttribute("username", uiList.get(i).getNickname());
                        session.setAttribute("aid", user.get(i).getAid());
                        //根据老师账号id查找管理班级的id
                        List<GradeUser> gradeUsers = loService.selectByUserId(user.get(i).getAid());
                        //List<Grade> grades = loGradeService.selectByGradeId(gradeUsers.get(0).getGradeid());
                        List<Grade> banList = new ArrayList<Grade>();
                        for (int j = 0; j < gradeUsers.size(); j++) {
                            List<Grade> grades = loService.selectByGradeId(gradeUsers.get(j).getGradeid());
                            banList.add(grades.get(0));
                        }
                        session.setAttribute("banList", banList);
                        //查询最近七次作业提交情况
                        List<Integer> sum = new ArrayList<>();
                        List<Releasee> releasees = loService.select7daycount(gradeUsers.get(0).getGradeid());

                        for (int j = 0; j < releasees.size(); j++) {
                            sum.add(loService.selectByRelid(releasees.get(j).getRid()).size());
                        }
                        session.setAttribute("ci1", sum.get(6));
                        session.setAttribute("ci2", sum.get(5));
                        session.setAttribute("ci3", sum.get(4));
                        session.setAttribute("ci4", sum.get(3));
                        session.setAttribute("ci5", sum.get(2));
                        session.setAttribute("ci6", sum.get(1));
                        session.setAttribute("ci7", sum.get(0));
                        System.out.println("sum:" + sum.toString());
                        return "/thome";
                    }
                }
            }
            model.addAttribute("msg", "账号或密码错误");
            return "login";
        } else {
            model.addAttribute("msg", "您输入的账号不存在");
            return "login";
        }
    }

    @RequestMapping("/testZong")
    @ResponseBody
    public String test() {
        //根据老师账号id查找管理班级的id
        List<GradeUser> gradeUsers = loService.selectByUserId(2);
        for (GradeUser gradeUser : gradeUsers) {
            System.out.println(gradeUser.toString());
        }
        List<Grade> grades = loService.selectByGradeId(gradeUsers.get(0).getGradeid());
        for (Grade grade : grades) {
            System.out.println(grade.toString());
        }
        //model.addAttribute("ban1",grades.get(0).getGname());
        return "";
    }
}
