package com.kgc.service.impl;

import com.kgc.mapper.*;
import com.kgc.pojo.*;
import com.kgc.service.DhnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.annotation.ElementType;
import java.util.List;

/**
 * @author shkstart
 */
@Service("dhnService")
public class DhnServiceImpl implements DhnService {
    @Resource
    UserInfoMapper userInfoMapper;

    @Resource
    WorksMapper worksMapper;

    @Resource
    ReleaseeMapper releaseeMapper;

    @Resource
    GradeUserMapper gradeUserMapper;

    @Resource
    ReplyMapper replyMapper;


    @Override
    public List<UserInfo> seluserid(Integer aid) {
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andAccidEqualTo(aid);
        return userInfoMapper.selectByExample(example);
    }

    @Override
    public GradeUser selGradeId(Integer userid) {
        GradeUserExample example = new GradeUserExample();
        GradeUserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<GradeUser> gradeUsers = gradeUserMapper.selectByExample(example);
        GradeUser gradeUser = gradeUsers.get(0);
        return gradeUser;
    }

    @Override
    public List<Releasee> selwork(Integer gradeid, Integer Num, Integer pageSize) {
        ReleaseeExample example = new ReleaseeExample();
        ReleaseeExample.Criteria criteria = example.createCriteria();
        criteria.andGradeidEqualTo(gradeid);
        return releaseeMapper.selectByExample(example);
    }

    @Override
    public List<Reply> selhuifu(Integer workid) {
        ReplyExample example = new ReplyExample();
        ReplyExample.Criteria criteria = example.createCriteria();
        criteria.andWoridEqualTo(workid);
        return replyMapper.selectByExample(example);
    }

    @Override
    public int tijiaozuoye(Works works) {
        return worksMapper.insert(works);
    }
}
