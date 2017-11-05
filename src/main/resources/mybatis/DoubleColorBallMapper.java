package com.lottery.dao.mybatis.mapper;

import com.lottery.dao.mybatis.model.DoubleColorBall;
import com.lottery.dao.mybatis.model.DoubleColorBallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoubleColorBallMapper {
    int countByExample(DoubleColorBallExample example);

    int deleteByExample(DoubleColorBallExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoubleColorBall record);

    int insertSelective(DoubleColorBall record);

    List<DoubleColorBall> selectByExample(DoubleColorBallExample example);

    DoubleColorBall selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoubleColorBall record, @Param("example") DoubleColorBallExample example);

    int updateByExample(@Param("record") DoubleColorBall record, @Param("example") DoubleColorBallExample example);

    int updateByPrimaryKeySelective(DoubleColorBall record);

    int updateByPrimaryKey(DoubleColorBall record);
}