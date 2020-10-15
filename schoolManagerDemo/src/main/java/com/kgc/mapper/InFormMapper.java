package com.kgc.mapper;

import com.kgc.pojo.InForm;
import com.kgc.pojo.InFormExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InFormMapper {
    int countByExample(InFormExample example);

    int deleteByExample(InFormExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(InForm record);

    int insertSelective(InForm record);

    List<InForm> selectByExample(InFormExample example);

    InForm selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") InForm record, @Param("example") InFormExample example);

    int updateByExample(@Param("record") InForm record, @Param("example") InFormExample example);

    int updateByPrimaryKeySelective(InForm record);

    int updateByPrimaryKey(InForm record);
}