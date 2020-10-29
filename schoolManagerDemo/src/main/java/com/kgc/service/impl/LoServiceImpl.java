package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.mapper.*;
import com.kgc.pojo.*;
import com.kgc.service.LoService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("loService")
public class LoServiceImpl implements LoService {
    @Resource
    GradeMapper gradeMapper;
    @Resource
    GradeUserMapper gradeUserMapper;
    @Resource
    ReleaseeMapper releaseeMapper;
    @Resource
    WorksMapper worksMapper;
    @Resource
    LoService loService;
    @Resource
    UserInfoMapper userInfoMapper;
    @Resource
    ReplyMapper replyMapper;
    @Override
    public List<Grade> selectByGradeId(int gradeId) {
        GradeExample example=new GradeExample();
        GradeExample.Criteria criteria = example.createCriteria();
        criteria.andGidEqualTo(gradeId);
        List<Grade> grades = gradeMapper.selectByExample(example);
        return grades;
    }
    @Override
    public List<GradeUser> selectByUserId(int userid) {
        GradeUserExample example=new GradeUserExample();
        GradeUserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<GradeUser> gradeUsers = gradeUserMapper.selectByExample(example);
        return gradeUsers;
    }
    @Override
    public List<Releasee> select7daycount(int gradeid) {
        System.out.println("gradeid:"+gradeid);
        ReleaseeExample example=new ReleaseeExample();
        example.setOrderByClause("rid");
        ReleaseeExample.Criteria criteria = example.createCriteria();
        criteria.andGradeidEqualTo(gradeid);
        List<Releasee> releasees = releaseeMapper.selectByExample(example);
        List<Releasee> rList=new ArrayList<>();
        if(releasees.size()<6){
            for (int i=0;i<releasees.size();i++){
                rList.add(releasees.get(i));
            }
        }else{
            for (int i=0;i<=6;i++){
                rList.add(releasees.get(i));
            }
        }
        return rList;
    }
    @Override
    public List<Works> selectByRelid(int relid) {
        WorksExample example=new WorksExample();
        WorksExample.Criteria criteria = example.createCriteria();
        criteria.andRelidEqualTo(relid);
        List<Works> works = worksMapper.selectByExample(example);
        return works;
    }
    @Override
    public List<Integer> select7daycountGrade(int gradeid) {
        WorksExample example=new WorksExample();
        example.setOrderByClause("wid");
        WorksExample.Criteria criteria = example.createCriteria();
        criteria.andGradeidEqualTo(gradeid);
        List<Works> wList=worksMapper.selectByExample(example);
        List<Integer> sum=new ArrayList();
      /* for(int i=0;i<wList.size();i++){
           if(sum.size()!=0){
               for(int j=0;j<)
           }
       }*/
        return sum;
    }

    @Override
    public List<GradeUser> selectByUserIdd(int userID) {
        GradeUserExample example=new GradeUserExample();
        GradeUserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userID);
        List<GradeUser> gradeUsers = gradeUserMapper.selectByExample(example);
        return gradeUsers;
    }

    @Override
    public List<Grade> selectByGid(int gid) {
        GradeExample example=new GradeExample();
        GradeExample.Criteria criteria = example.createCriteria();
        criteria.andGidEqualTo(gid);
        List<Grade> grades = gradeMapper.selectByExample(example);
        return grades;
    }

    @Override
    public int insertReleasee(Releasee releasee) {
        int i = releaseeMapper.insertSelective(releasee);
        return i;
    }

    @Override
    public PageInfo<Releasee> selectByGradeIdd(Integer pageNum,Integer pageSize,int gradeId) {
        ReleaseeExample example=new ReleaseeExample();
        ReleaseeExample.Criteria criteria = example.createCriteria();
        criteria.andGradeidEqualTo(gradeId);
        PageHelper.startPage(pageNum, pageSize);
        List<Releasee> releasees = releaseeMapper.selectByExample(example);
        for(int i=0;i<releasees.size();i++){
            List<Grade> grades = loService.selectByGid(releasees.get(i).getGradeid());
            releasees.get(i).setGrade(grades.get(grades.size()-1));
        }
        PageInfo<Releasee> pageInfo = new PageInfo<>(releasees);
        return pageInfo;
    }

    @Override
    public List<Works> selecyByRelId(int id) {
        WorksExample example=new WorksExample();
        WorksExample.Criteria criteria = example.createCriteria();
        criteria.andRelidEqualTo(id);
        List<Works> works = worksMapper.selectByExample(example);
        for(int i=0;i<works.size();i++){
            List<Grade> grades = loService.selectByGid(works.get(i).getGradeid());
            works.get(i).setGrade(grades.get(grades.size()-1));
            List<UserInfo> userInfos = loService.selectByAccid(works.get(i).getUserid());
            works.get(i).setUserInfo(userInfos.get(userInfos.size()-1));
        }
        return works;
    }

    @Override
    public List<UserInfo> selectByAccid(int addid) {
        UserInfoExample example=new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andAccidEqualTo(addid);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        return userInfos;
    }

    @Override
    public int updateWorksIsverify(Works works) {
        int i = worksMapper.updateByPrimaryKeySelective(works);
        return i;
    }

    @Override
    public int insertReply(Reply reply) {
        int i = replyMapper.insertSelective(reply);
        return i;
    }

    @Override
    public Releasee selectByRid(int rid) {
        Releasee releasee = releaseeMapper.selectByPrimaryKey(rid);
        return releasee;
    }
}
