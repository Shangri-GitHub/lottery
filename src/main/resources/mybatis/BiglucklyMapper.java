package com.lottery.dao.mybatis.mapper;

import com.lottery.dao.mybatis.model.Bigluckly;
import com.lottery.dao.mybatis.model.BiglucklyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiglucklyMapper {
    int countByExample(BiglucklyExample example);

    int deleteByExample(BiglucklyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bigluckly record);

    int insertSelective(Bigluckly record);

    List<Bigluckly> selectByExample(BiglucklyExample example);

    Bigluckly selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bigluckly record, @Param("example") BiglucklyExample example);

    int updateByExample(@Param("record") Bigluckly record, @Param("example") BiglucklyExample example);

    int updateByPrimaryKeySelective(Bigluckly record);

    int updateByPrimaryKey(Bigluckly record);
}