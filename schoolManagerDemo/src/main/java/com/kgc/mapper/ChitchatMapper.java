package com.kgc.mapper;

import com.kgc.pojo.Chitchat;
import com.kgc.pojo.ChitchatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChitchatMapper {
    int countByExample(ChitchatExample example);

    int deleteByExample(ChitchatExample example);

    int deleteByPrimaryKey(Integer chid);

    int insert(Chitchat record);

    int insertSelective(Chitchat record);

    List<Chitchat> selectByExample(ChitchatExample example);

    List<Chitchat> selectByXiao(@Param("aid") Integer aid, @Param("haoid") Integer haoid);
    List<Chitchat> selectByXiao1(@Param("aid") Integer aid, @Param("haoid") Integer haoid);
    List<Chitchat> selectNiCeName(@Param("aid") Integer aid, @Param("nickname") String nickname);
    List<Chitchat> selectByHao(@Param("aid") Integer aid);
    Chitchat selectByPrimaryKey(Integer chid);

    int updateByExampleSelective(@Param("record") Chitchat record, @Param("example") ChitchatExample example);

    int updateByExample(@Param("record") Chitchat record, @Param("example") ChitchatExample example);

    int updateByPrimaryKeySelective(Chitchat record);

    int updateByPrimaryKey(Chitchat record);
}