package com.kgc.controller;

import com.kgc.pojo.*;
import com.kgc.service.LvDongService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-09-08 10:15
 */
@Controller
public class ChitchatController {
    @Resource
    LvDongService service;

    /**
     * 东，跳转聊天界面toChitchat
     * @return
     */
    @RequestMapping("/tochitchat")
    public String lvToChitchat(){
        return "chitchat";
    }
    /**
     * 东,跳转聊窗口查询好友
     * @return
     */
    @RequestMapping("/lvSelectHao")
    @ResponseBody
    public Map<String,Object> lvSelectHao(Integer aid){
        Map<String,Object> map=new HashMap<>();
        List<Chitchat> chitchats = service.lvSelectByHao(aid);
        if (chitchats==null){
            map.put("status","false");
        }{
            map.put("data",chitchats);
            map.put("status","true");
        }
        return map;
    }
    /**
     * 东,跳转聊窗口根据好友id获取好友的信息
     * @return
     */
    @RequestMapping("/lvSelectHaoXinXi")
    @ResponseBody
    public Map<String,Object> lvSelectHaoXinXi(Integer aid,Integer haoid){
        Map<String,Object> map=new HashMap<>();
        UserInfo userinfo = service.lvSelectHaoXinXi(haoid);
        Chitchat chitchat = service.lvSelectByHaoXiao(aid, haoid);
        if (chitchat==null){
            map.put("data2","null");
        }else{
            map.put("data2",chitchat);
        }
        map.put("data",userinfo);
        return map;
    }
    /**
     * 东,点击好友，根据好友id获取聊天信息
     * @return
     */
    @RequestMapping("/lvSelectHaoXiaoXi")
    @ResponseBody
    public Map<String,Object> lvSelectHaoXiaoXi(Integer aid,Integer haoid){
        Map<String,Object> map=new HashMap<>();
        List<Chitchat> chitchats = service.lvSelectByHaoXiao11(aid, haoid);
        map.put("data",chitchats);
        return map;
    }
    /**
     * 东,发送聊天
     * @return
     */
    @RequestMapping("/addXiaoXi")
    @ResponseBody
    public Map<String,Object> addXiaoXi(Integer aid,Integer haoid,String neirong){
        Map<String,Object> map=new HashMap<>();
        Chitchat chitchat = service.lvChitchatId(aid, haoid);
        Chitchat chitchat1 = service.lvChitchatId(haoid, aid);
        XiaoXi xiaoXi=new XiaoXi();
        xiaoXi.setChid(chitchat.getChid());
        xiaoXi.setZhu(aid);
        xiaoXi.setCreatedate(new Date());
        xiaoXi.setNeirong(neirong);
        XiaoXi xiaoXi1=new XiaoXi();
        xiaoXi1.setChid(chitchat1.getChid());
        xiaoXi1.setZhu(aid);
        xiaoXi1.setCreatedate(xiaoXi.getCreatedate());
        xiaoXi1.setNeirong(neirong);
        int i = service.addXiaoXi(xiaoXi);
        int i1 = service.addXiaoXi(xiaoXi1);
        if (i>0||i1>0){
            map.put("success","true");
        }else {
            map.put("success","false");
        }
        return map;
    }
    /**
     * 东,发送聊天
     * @return
     */
    @RequestMapping("/moHuCha")
    @ResponseBody
    public Map<String,Object> moHuCha(Integer aid,String nickname){
        Map<String,Object> map=new HashMap<>();
        List<Chitchat> chitchats = service.lvSelectNiCeName(aid, nickname);
        map.put("data",chitchats);
        return map;
    }

    /**
     * 东,添加好友查询信息
     * @return
     */
    @RequestMapping("/toSelectAcc")
    @ResponseBody
    public Map<String,Object> toSelectAcc(String acc){
        Map<String,Object> map=new HashMap<>();
        Account account = service.selectUserName(acc);
        if (account!=null){
            UserInfo userInfo = service.lvSelectHaoXinXi(account.getAid());
            map.put("success",userInfo);
        }else{
            map.put("success","此账号没有注册");
        }
        return map;
    }
    /**
     * 东,添加好友
     * @return
     */
    @RequestMapping("/addChitchat")
    @ResponseBody
    public Map<String,Object> addChitchat(Integer haoid,Integer id){
        Map<String,Object> map=new HashMap<>();
        Backlog backlog=new Backlog();
        backlog.setAid(id);
        backlog.setHaoid(haoid);
        int i = service.lvAddBacklog(backlog);
        if (i>0){
            map.put("success","true");
        }else{
            map.put("success","false");
        }
        return map;
    }

    /**
     * 东,查询有没有好友申请信息
     * @return
     */
    @RequestMapping("/lvSelectFriends")
    @ResponseBody
    public Map<String,Object> lvSelectFriend(Integer id){
        Map<String,Object> map=new HashMap<>();
        List<Backlog> backlogs = service.lvSelectFriend(id);
        map.put("dataSize",backlogs.size());
        map.put("data",backlogs);
        return map;
    }
    /**
     * 东,查询有没有好友申请信息的人
     * @return
     */
    @RequestMapping("/lvSelectFriendsInfo")
    @ResponseBody
    public Map<String,Object> lvSelectFriendsInfo(Integer id){
        Map<String,Object> map=new HashMap<>();
        UserInfo userInfo = service.selectUserByAid(id);
        map.put("data",userInfo);
        return map;
    }
    /**
     * 东,好友申请同意
     * @return
     */
    @RequestMapping("/lvAddFriends")
    @ResponseBody
    public Map<String,Object> lvAddFriends(Integer accid,Integer aid,Integer backid){
        Map<String,Object> map=new HashMap<>();
        Chitchat chitchat=new Chitchat();
        chitchat.setHaoid(accid);
        chitchat.setUserid(aid);
        Chitchat chitchat2=new Chitchat();
        chitchat2.setHaoid(aid);
        chitchat2.setUserid(accid);
        int i = service.lvAddChitchat(chitchat);
        int i1 = service.lvAddChitchat(chitchat2);
        if (i>0&&i1>0){
            int i2 = service.lvDelChitchat(backid);
            if (i2>0){
                map.put("success","true");
            }else{
                map.put("success","false");
            }
        }
        return map;
    }
    /**
     * 东,好友申请拒绝
     * @return
     */
    @RequestMapping("/lvDelFriends")
    @ResponseBody
    public Map<String,Object> lvDelFriends(Integer backid){
        Map<String,Object> map=new HashMap<>();
        int i2 = service.lvDelChitchat(backid);
        if (i2>0){
            map.put("success","true");
        }else{
            map.put("success","false");
        }
        return map;
    }
}