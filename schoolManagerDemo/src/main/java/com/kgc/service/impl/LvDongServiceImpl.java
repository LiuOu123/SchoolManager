package com.kgc.service.impl;

import com.kgc.mapper.*;
import com.kgc.pojo.*;
import com.kgc.service.LvDongService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-15 18:32
 */
@Service
public class LvDongServiceImpl implements LvDongService {
    @Resource
    XiaoXiMapper xiaoXiMapper;
    @Resource
    ChitchatMapper chitchatMapper;
    @Resource
    UserInfoMapper userinfoMapper;
    @Resource
    AccountMapper accountMapper;
    @Resource
    BacklogMapper backlogMapper;
    //添加消息
    @Override
    public int addXiaoXi(XiaoXi xiaoXi) {
        int i = xiaoXiMapper.insertSelective(xiaoXi);
        return i;
    }

    @Override
    public List<Chitchat> lvSelectByHao(Integer aid) {
        List<Chitchat> chitchats = chitchatMapper.selectByHao(aid);
        return chitchats;
    }
    @Override
    public UserInfo lvSelectHaoXinXi(Integer haoid) {
        UserInfoExample userinfoExample=new UserInfoExample();
        UserInfoExample.Criteria criteria = userinfoExample.createCriteria();
        criteria.andAccidEqualTo(haoid);
        criteria.andUtypeNotEqualTo(0);
        List<UserInfo> userinfos = userinfoMapper.selectByExample(userinfoExample);
        UserInfo userinfo1 = userinfos.get(0);
        return userinfo1;
    }

    @Override
    public synchronized Chitchat lvSelectByHaoXiao(Integer aid, Integer haoid) {
        List<Chitchat> chitchats = chitchatMapper.selectByXiao(aid, haoid);
        if (chitchats.size()!=0){
            return chitchats.get(0);
        }
        return null;
    }
    @Override
    public  List<Chitchat> lvSelectByHaoXiao11(Integer aid, Integer haoid) {
        List<Chitchat> chitchats = chitchatMapper.selectByXiao1(aid, haoid);
        return chitchats;
    }

    @Override
    public List<Chitchat> lvSelectNiCeName(Integer aid, String nickname) {
        return chitchatMapper.selectNiCeName(aid,"%"+nickname+"%");
    }

    @Override
    public Account selectUserName(String acc) {
        AccountExample accountExample=new AccountExample();
        AccountExample.Criteria criteria = accountExample.createCriteria();
        criteria.andAccountnameEqualTo(acc);
        List<Account> accounts = accountMapper.selectByExample(accountExample);
        if (accounts.size()>0){
            return accounts.get(0);
        }
        return null;
    }

    @Override
    public UserInfo selectUserByAid(Integer id) {
        UserInfoExample userInfoExample=new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andAccidEqualTo(id);
        List<UserInfo> userInfos = userinfoMapper.selectByExample(userInfoExample);
        if (userInfos.size()>0){
            return userInfos.get(0);
        }
        return null;
    }

    public int lvAddBacklog(Backlog backlog) {
        int i = backlogMapper.insertSelective(backlog);
        return i;
    }

    @Override
    public List<Backlog> lvSelectFriend(Integer id) {
        BacklogExample backlogExample=new BacklogExample();
        BacklogExample.Criteria criteria = backlogExample.createCriteria();
        criteria.andHaoidEqualTo(id);
        List<Backlog> backlogs = backlogMapper.selectByExample(backlogExample);
        return backlogs;
    }

    @Override
    public int lvAddChitchat(Chitchat chitchat) {
        int i = chitchatMapper.insertSelective(chitchat);
        return i;
    }

    @Override
    public int lvDelChitchat(Integer backid) {
        return backlogMapper.deleteByPrimaryKey(backid);
    }

    @Override
    public Chitchat lvChitchatId(Integer aid, Integer haoid) {
        ChitchatExample chitchatExample=new ChitchatExample();
        ChitchatExample.Criteria criteria = chitchatExample.createCriteria();
        criteria.andUseridEqualTo(aid);
        criteria.andHaoidEqualTo(haoid);
        List<Chitchat> chitchats = chitchatMapper.selectByExample(chitchatExample);
        return chitchats.get(0);
    }

    @Override
    public Account lvSelectByAcc(Integer aid) {
        return accountMapper.selectByPrimaryKey(aid);
    }

    @Override
    public UserInfo lvSelectByUserInfo(Integer aid) {
        UserInfoExample userInfoExample=new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andAccidEqualTo(aid);
        criteria.andUtypeEqualTo(1);
        return userinfoMapper.selectByExample(userInfoExample).get(0);
    }


}
