package com.ming.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ming.domain.User;

@Repository //dao 명시
public interface TestDao {

	List<User> select();

	void insert(String name);

}
