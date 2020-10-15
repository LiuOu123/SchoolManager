package com.kgc.mapper;

import com.kgc.pojo.Path;
import com.kgc.pojo.PathExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PathMapper {
    int countByExample(PathExample example);

    int deleteByExample(PathExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Path record);

    int insertSelective(Path record);

    List<Path> selectByExample(PathExample example);

    Path selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Path record, @Param("example") PathExample example);

    int updateByExample(@Param("record") Path record, @Param("example") PathExample example);

    int updateByPrimaryKeySelective(Path record);

    int updateByPrimaryKey(Path record);
}