package com.lottery.dao.mybatis.mapper;

import com.lottery.dao.mybatis.model.AccessToken;
import com.lottery.dao.mybatis.model.AccessTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessTokenMapper {
    int countByExample(AccessTokenExample example);

    int deleteByExample(AccessTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccessToken record);

    int insertSelective(AccessToken record);

    List<AccessToken> selectByExample(AccessTokenExample example);

    AccessToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccessToken record, @Param("example") AccessTokenExample example);

    int updateByExample(@Param("record") AccessToken record, @Param("example") AccessTokenExample example);

    int updateByPrimaryKeySelective(AccessToken record);

    int updateByPrimaryKey(AccessToken record);
}