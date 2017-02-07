package com.ming.dao;

import org.springframework.stereotype.Repository;

import com.ming.domain.User;

@Repository
public interface UserDao {
	
	void insert(User user);

}
