package com.kgc.controller;

import com.kgc.pojo.Releasee;
import com.kgc.pojo.Works;
import com.kgc.service.LoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;


@Controller
public class ExcleController {
    //这里直接new了
    ExcleImpl  excleImpl=new ExcleImpl();
    @Resource
    LoService loService;

    @RequestMapping(value="/jsp/download_excel")

//获取url链接上的参数
    public @ResponseBody String dowm(HttpServletResponse response,@RequestParam("id") int id,@RequestParam("name") String name){
        response.setContentType("application/binary;charset=UTF-8");
        List<Works> works = loService.selecyByRelId(id);//查询works表中relid列中符合传过来值的数据
        for (Works work : works) {
            System.out.println(work.toString());
        }
        Releasee releasee = loService.selectByRid(id);
        try{
            ServletOutputStream out=response.getOutputStream();
            try {
                //设置文件头：最后一个参数是设置下载文件名(这里我们叫：张三.pdf)
                response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(releasee.getReltitle()+"作业提交情况"+".xls", "UTF-8"));
            } catch (UnsupportedEncodingException e1) {
                e1.printStackTrace();
            }
            String[] titles = { "班级","用户","标题","内容","提交时间" };
            excleImpl.export(titles, out,works);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
