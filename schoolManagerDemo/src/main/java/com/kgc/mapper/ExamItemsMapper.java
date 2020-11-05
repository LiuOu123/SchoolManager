package com.kgc.mapper;

import com.kgc.pojo.ExamItems;
import com.kgc.pojo.ExamItemsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamItemsMapper {
    int countByExample(ExamItemsExample example);

    int deleteByExample(ExamItemsExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(ExamItems record);

    int insertSelective(ExamItems record);

    List<ExamItems> selectByExample(ExamItemsExample example);

    ExamItems selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") ExamItems record, @Param("example") ExamItemsExample example);

    int updateByExample(@Param("record") ExamItems record, @Param("example") ExamItemsExample example);

    int updateByPrimaryKeySelective(ExamItems record);

    int updateByPrimaryKey(ExamItems record);
}