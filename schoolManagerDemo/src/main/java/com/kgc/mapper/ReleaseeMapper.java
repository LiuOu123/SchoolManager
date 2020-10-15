package com.kgc.mapper;

import com.kgc.pojo.Releasee;
import com.kgc.pojo.ReleaseeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReleaseeMapper {
    int countByExample(ReleaseeExample example);

    int deleteByExample(ReleaseeExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Releasee record);

    int insertSelective(Releasee record);

    List<Releasee> selectByExample(ReleaseeExample example);

    Releasee selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Releasee record, @Param("example") ReleaseeExample example);

    int updateByExample(@Param("record") Releasee record, @Param("example") ReleaseeExample example);

    int updateByPrimaryKeySelective(Releasee record);

    int updateByPrimaryKey(Releasee record);
}