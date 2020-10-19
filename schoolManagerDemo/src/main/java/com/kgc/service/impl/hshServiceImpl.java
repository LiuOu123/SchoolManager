package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.mapper.AccountMapper;
import com.kgc.mapper.GradeMapper;
import com.kgc.mapper.GradeUserMapper;
import com.kgc.mapper.UserInfoMapper;
import com.kgc.pojo.*;
import com.kgc.service.HshService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-17 11:33
 */
@Service("hshService")
public class hshServiceImpl implements HshService {
    @Resource
    GradeMapper gradeMapper;
    @Resource
    UserInfoMapper userInfoMapper;
    @Resource
    GradeUserMapper gradeUserMapper;
    @Resource
    AccountMapper accountMapper;
    @Override
    public Grade hshGrade() {
        return (Grade) gradeMapper.selectByExample(null);
    }
    @Override
    public List<Grade> hshList() {
        return gradeMapper.selectByExample(null);
    }

    @Override
    public PageInfo<UserInfo> selfenye(Integer pageIndex, int pageSize, Integer accid, String name, Integer utype) {
        UserInfoExample example=new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        if(name !=""){
            criteria.andNicknameEqualTo(name);
        }
        if(accid!=0){
            criteria.andAccidEqualTo(accid);
        }
        if(utype!=0){
            criteria.andUtypeEqualTo(utype);
        }
        PageHelper.startPage(pageIndex, pageSize);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        PageInfo<UserInfo>  userInfoPageInfo=new PageInfo<>(userInfos);
        return userInfoPageInfo;
    }

    @Override
    public List<GradeUser> hshselg(Integer gradeid) {
        GradeUserExample example=new GradeUserExample();
        GradeUserExample.Criteria criteria = example.createCriteria();
        if(gradeid!=0){
            criteria.andGradeidEqualTo(gradeid);
        }
        return gradeUserMapper.selectByExample(example);
    }
    @Override
    public UserInfo hshselect(int aid, int tid) {
        UserInfo userInfo = null;
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andAccidEqualTo(aid);
        criteria.andUtypeEqualTo(tid);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        if (userInfos != null && userInfos.size() > 0) {
            userInfo = userInfos.get(0);
        }
        return userInfo;
    }

    @Override
    public int hshupdate(UserInfo userinfo) {
        int i = 0;
        UserInfo userInfo = new UserInfo();
        userInfo.setAccid(userInfo.getAccid());
        i = userInfoMapper.updateByPrimaryKeySelective(userinfo);
        return i;
    }

    @Override
    public int hshupdz(Integer accid, Integer utype) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUid(accid);
        userInfo.setUtype(utype);
        int i = userInfoMapper.updateByPrimaryKeySelective(userInfo);
        return i;
    }

    @Override
    public int hshins(UserInfo userInfo) {
        int insert = 0;
        insert = userInfoMapper.insert(userInfo);
        return insert;
    }

    @Override
    public List<UserInfo> hshsunm() {
        return userInfoMapper.selectByExample2(null);
    }

    @Override
    public int hshins2(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public int hshaccount(Account account) {
        return accountMapper.insertSelective(account);
    }

    @Override
    public int hshgradeuser(GradeUser gradeUser) {
        return gradeUserMapper.insertSelective(gradeUser);
    }

    @Override
    public Account accsel(String accountname) {
        AccountExample example = new AccountExample();
        AccountExample.Criteria criteria = example.createCriteria();
        criteria.andAccountnameEqualTo(accountname);
        List<Account> accounts = accountMapper.selectByExample(example);
        if (accounts.size() > 0) {
            return accounts.get(0);
        }
        return null;
    }
}
