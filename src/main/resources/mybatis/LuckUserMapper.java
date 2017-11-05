package com.lottery.dao.mybatis.mapper;

import com.lottery.dao.mybatis.model.LuckUser;
import com.lottery.dao.mybatis.model.LuckUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LuckUserMapper {
    int countByExample(LuckUserExample example);

    int deleteByExample(LuckUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LuckUser record);

    int insertSelective(LuckUser record);

    List<LuckUser> selectByExample(LuckUserExample example);

    LuckUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LuckUser record, @Param("example") LuckUserExample example);

    int updateByExample(@Param("record") LuckUser record, @Param("example") LuckUserExample example);

    int updateByPrimaryKeySelective(LuckUser record);

    int updateByPrimaryKey(LuckUser record);
}