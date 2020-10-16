package com.kgc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.mapper.AccountMapper;
import com.kgc.pojo.*;
import com.kgc.service.DhnService;
import jdk.nashorn.internal.ir.IfNode;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author shkstart
 */
@Controller
public class DhnLoginController {
    @Resource
    AccountMapper accountMapper;

    @Resource
    DhnService dhnService;


    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/dologin")
    public String toindex(Model model, @RequestParam String username, @RequestParam String password, HttpSession session) {
        AccountExample example = new AccountExample();
        AccountExample.Criteria criteria = example.createCriteria();
        criteria.andAccountnameEqualTo(username);
        List<Account> user = accountMapper.selectByExample(example);
        if (user.size() > 0) {
            for (int i = 0; i < user.size(); i++) {
                if (user.get(i).getPassword().equals(password)) {
                    if (user.get(i).getPosid() == 1) {
                        //账号id
                        Integer aid = user.get(i).getAid();
                        List<UserInfo> seluserid = dhnService.seluserid(aid);
                        //用户名
                        session.setAttribute("username", seluserid.get(i).getNickname());
                        //用户id
                        session.setAttribute("userid", seluserid.get(i).getUid());
                        return "student";
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

    @RequestMapping("/selzuoye")
    public String tijiaozuoye(HttpSession session, Model model, HttpServletRequest request) {
        int Num = 1;
        String pn = request.getParameter("pn");
        System.out.println(pn);
        if (pn != null) {
            Num = Integer.parseInt(pn);
        }


        Integer userid = (Integer) session.getAttribute("userid");
        //这是是查班级id的吧   userid不是他的主键啊
        GradeUser gradeUsers = dhnService.selGradeId(userid);
        //班级id
        Integer gradeid = gradeUsers.getGradeid();
        int PageSize = 4;
        PageHelper.startPage(Num, PageSize);
        List<Releasee> selwork = dhnService.selwork(gradeid, Num, PageSize);
        for (int i = 0; i < selwork.size(); i++) {
            //作业标题
            String reltitle = selwork.get(i).getReltitle();
            session.setAttribute("worktitle", reltitle);
            //作业id
            Integer rid = selwork.get(i).getRid();
            session.setAttribute("rid", rid);
            PageInfo pageInfo = new PageInfo(selwork);
            model.addAttribute("list", pageInfo);
        }
        return "selzuoye";
    }

    @RequestMapping("/selhuifu")
    public String selhuifu(Integer rid, Model model) {
        List<Reply> selhuifu = dhnService.selhuifu(rid);
        model.addAttribute("list", selhuifu);
        return "huifu";
    }

    @RequestMapping("/tijiaozuoye")
    public String tijiao(HttpSession session, MultipartFile wornei, Works works) {
        Integer gradeid = (Integer) session.getAttribute("gradeid");
        Integer userid = (Integer) session.getAttribute("userid");
        Integer rid = (Integer) session.getAttribute("rid");
        works.setGradeid(gradeid);
        works.setUserid(userid);
        works.setRelid(rid);
        String realPath = session.getServletContext().getRealPath("static/image");
        String originalFilename = wornei.getOriginalFilename();
        String extension = FilenameUtils.getExtension(originalFilename);
        String newName = System.currentTimeMillis() + (RandomUtils.nextInt(10000)) + "_." + extension;
        File file = new File(realPath, newName);
        try {
            wornei.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        works.setWornei(newName);
        int tijiaozuoye = dhnService.tijiaozuoye(works);
        if (tijiaozuoye > 0) {
            session.setAttribute("msg", "提交成功");
        } else {
            session.setAttribute("msg", "提交失败");
        }
        return "redirect:/selzuoye";
    }
}
