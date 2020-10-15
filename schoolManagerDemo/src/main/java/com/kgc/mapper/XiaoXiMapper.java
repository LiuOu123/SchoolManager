package com.kgc.mapper;

import com.kgc.pojo.XiaoXi;
import com.kgc.pojo.XiaoXiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XiaoXiMapper {
    int countByExample(XiaoXiExample example);

    int deleteByExample(XiaoXiExample example);

    int deleteByPrimaryKey(Integer xid);

    int insert(XiaoXi record);

    int insertSelective(XiaoXi record);

    List<XiaoXi> selectByExample(XiaoXiExample example);

    XiaoXi selectByPrimaryKey(Integer xid);

    int updateByExampleSelective(@Param("record") XiaoXi record, @Param("example") XiaoXiExample example);

    int updateByExample(@Param("record") XiaoXi record, @Param("example") XiaoXiExample example);

    int updateByPrimaryKeySelective(XiaoXi record);

    int updateByPrimaryKey(XiaoXi record);
}