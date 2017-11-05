package com.lottery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.mybatis.mapper.AccessTokenMapper;
import com.lottery.dao.mybatis.model.AccessToken;

@Service
public class AccessTokenService {

	@Autowired
	AccessTokenMapper accessTokenMapper;

	public AccessToken selectByUserName(String userName) {
		AccessToken example = new AccessToken();
		example.setUserName(userName);
		AccessToken result = accessTokenMapper.selectOne(example);
		return result;
	}

	public void insert(AccessToken create) {
		accessTokenMapper.insert(create);
	}

	public void update(AccessToken update) {
		accessTokenMapper.updateByPrimaryKey(update);
	}
	

}
