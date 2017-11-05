package com.lottery.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.lottery.dao.mybatis.mapper.BiglucklyMapper;
import com.lottery.dao.mybatis.model.Bigluckly;
import org.springframework.stereotype.Service;

@Service
public class BiglucklyService {
    @Autowired
    BiglucklyMapper biglucklyMapper;
    public Bigluckly selectById(Long id) {
        Bigluckly bigluckly = new Bigluckly();
        bigluckly.setId(id.intValue());
        Bigluckly result = biglucklyMapper.selectOne(bigluckly);
        return result;
    }


}
