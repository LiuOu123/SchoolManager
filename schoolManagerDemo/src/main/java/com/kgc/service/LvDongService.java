package com.kgc.service;

import com.kgc.pojo.*;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-15 18:32
 */
public interface LvDongService {
    int addXiaoXi(XiaoXi xiaoXi);
    List<Chitchat> lvSelectByHao(Integer aid);
    UserInfo lvSelectHaoXinXi(Integer haoid);
    Chitchat lvSelectByHaoXiao(Integer aid, Integer haoid);
    List<Chitchat> lvSelectByHaoXiao11(Integer aid, Integer haoid);
    List<Chitchat> lvSelectNiCeName(Integer aid, String nickname);
    //搜索好友
    Account selectUserName(String acc);
    //根据accid查询账号信息
    UserInfo selectUserByAid(Integer id);

    //添加好友申请
     int lvAddBacklog(Backlog backlog);
    //查询有没有好友申请
    List<Backlog> lvSelectFriend(Integer id);
    //添加好友
    int lvAddChitchat(Chitchat chitchat);
    //删除好友申请
    int lvDelChitchat(Integer backid);
    //获取好友关系id
    Chitchat lvChitchatId(Integer aid, Integer haoid);
}
