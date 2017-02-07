package com.ming.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ming.dao.TestDao;
import com.ming.domain.User;
import com.ming.service.TestService;

@Service //client가 요청한 사항을 service에서 처리해서 (dao를 사용) controller로 반환
public class TestServiceImpl implements TestService { //service에 있는 걸 실제로 구현한 것

	@Autowired
	private TestDao testDao;
	
	@Override //실제 구현하는 것
	public List<User> select() { //testDao에 있는 select 메소드 호출
		return testDao.select();
	}

	@Override
	public void insert(String name) {
		testDao.insert(name); //testDao에 있는 insert를 호출, name변수를 넘겨주기
	}

}
