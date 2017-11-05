package com.lottery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.mybatis.mapper.LuckUserMapper;
import com.lottery.dao.mybatis.model.LuckUser;

@Service
public class LuckUserService {

	@Autowired
	LuckUserMapper luckUserMapper;

	public LuckUser selectByUserName(String userName) {
		LuckUser example = new LuckUser();
		example.setUserName(userName);
		LuckUser result = luckUserMapper.selectOne(example);
		return result;
	}

}
