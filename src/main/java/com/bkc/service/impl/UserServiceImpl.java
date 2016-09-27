package com.bkc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bkc.dao.UserMapper;
import com.bkc.pojo.po.User;
import com.bkc.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userDao;

	public List<User> findAll() {
		return userDao.findAll();
	}

	public int add(User user) {
		return userDao.insert(user);
	}

	public void update(User user) {
		userDao.updateByPrimaryKey(user);
	}
}
