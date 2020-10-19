package com.kgc.mapper;

import com.kgc.pojo.Backlog;
import com.kgc.pojo.BacklogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BacklogMapper {
    int countByExample(BacklogExample example);

    int deleteByExample(BacklogExample example);

    int deleteByPrimaryKey(Integer backid);

    int insert(Backlog record);

    int insertSelective(Backlog record);

    List<Backlog> selectByExample(BacklogExample example);

    Backlog selectByPrimaryKey(Integer backid);

    int updateByExampleSelective(@Param("record") Backlog record, @Param("example") BacklogExample example);

    int updateByExample(@Param("record") Backlog record, @Param("example") BacklogExample example);

    int updateByPrimaryKeySelective(Backlog record);

    int updateByPrimaryKey(Backlog record);
}