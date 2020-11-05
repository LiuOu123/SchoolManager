package com.kgc.mapper;

import com.kgc.pojo.ExamScoreDetail;
import com.kgc.pojo.ExamScoreDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamScoreDetailMapper {
    int countByExample(ExamScoreDetailExample example);

    int deleteByExample(ExamScoreDetailExample example);

    int deleteByPrimaryKey(Integer detailid);

    int insert(ExamScoreDetail record);

    int insertSelective(ExamScoreDetail record);

    List<ExamScoreDetail> selectByExample(ExamScoreDetailExample example);

    ExamScoreDetail selectByPrimaryKey(Integer detailid);

    int updateByExampleSelective(@Param("record") ExamScoreDetail record, @Param("example") ExamScoreDetailExample example);

    int updateByExample(@Param("record") ExamScoreDetail record, @Param("example") ExamScoreDetailExample example);

    int updateByPrimaryKeySelective(ExamScoreDetail record);

    int updateByPrimaryKey(ExamScoreDetail record);
}