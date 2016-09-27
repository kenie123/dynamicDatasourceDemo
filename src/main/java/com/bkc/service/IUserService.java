package com.bkc.service;

import java.util.List;

import com.bkc.pojo.po.User;

public interface IUserService {

	List<User> findAll();

	int add(User user);

	void update(User user);
}
