package com.ming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ming.domain.User;
import com.ming.service.TestService;
//controller : client에 받아서 결과를 return해주기, 문의 역할

@RestController //데이터로 반환해주기

@RequestMapping("/board") //url 주소
public class TestController {
	
	@Autowired //spring에 있는 TestService를 가져와서 testService로 쓰겠다
	private TestService testService;
	
	@GetMapping("/all") //url을 통해서 매개변수를 넘겨주기
	List<User> select(){
		return testService.select();
	}

	@PostMapping("/insert") //정보 수정 (업데이트)
	//DeleteMapping : 정보 삭제
	//PostMapping : 정보 등록
	//위 3개는 url을 통해서 하는 것이 아니라 정보가 숨겨져 있어서 ulr로 접근 불가
	String test2(@RequestParam String name){
		testService.insert(name);
		return "ok";
	}

}
