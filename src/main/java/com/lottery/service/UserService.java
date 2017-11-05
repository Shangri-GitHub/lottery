package com.lottery.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.mybatis.mapper.UserMapper;
import com.lottery.dao.mybatis.model.User;
import com.lottery.dao.mybatis.model.UserExample;
import java.util.List;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

	public User selectById(Long id) {
		User user = new User();
		return userMapper.selectOne(user);
	}
	
	public List<User> selectUsersByLikeName(String name) {
		UserExample example = new UserExample();
		UserExample.Criteria c = example.createCriteria();
		c.andNameLike(name);
		return userMapper.selectByExample(example);
	}

}
