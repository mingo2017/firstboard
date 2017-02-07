package com.ming.service;

import java.util.List;

import com.ming.domain.User;

public interface TestService { //실제 복잡한 비지니스 로직 구현

	List<User> select();

	void insert(String name);
	
}
