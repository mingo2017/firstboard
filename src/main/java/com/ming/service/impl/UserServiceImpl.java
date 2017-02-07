package com.ming.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ming.dao.UserDao;
import com.ming.domain.User;
import com.ming.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public String insert(User user) {
		// TODO Auto-generated method stub
		userDao.insert(user);
		return null;
	}

}
