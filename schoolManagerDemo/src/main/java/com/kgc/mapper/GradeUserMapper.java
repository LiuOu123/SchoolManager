package com.kgc.mapper;

import com.kgc.pojo.GradeUser;
import com.kgc.pojo.GradeUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeUserMapper {
    int countByExample(GradeUserExample example);

    int deleteByExample(GradeUserExample example);

    int deleteByPrimaryKey(Integer guid);

    int insert(GradeUser record);

    int insertSelective(GradeUser record);

    List<GradeUser> selectByExample(GradeUserExample example);

    GradeUser selectByPrimaryKey(Integer guid);

    int updateByExampleSelective(@Param("record") GradeUser record, @Param("example") GradeUserExample example);

    int updateByExample(@Param("record") GradeUser record, @Param("example") GradeUserExample example);

    int updateByPrimaryKeySelective(GradeUser record);

    int updateByPrimaryKey(GradeUser record);
}