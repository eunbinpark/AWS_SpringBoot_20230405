package com.web.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserPageController {

	@GetMapping("/page/user/addition")
	public String addUser() {
		return "AddUser";	// HTML 파일 명(위 링크로 접속하면 해당 파일을 띄워줌)
	}
	
	@GetMapping("page/user/search")
	public String getUser() {
		return "FindUser";	// HTML 파일 명(위 링크로 접속하면 해당 파일을 띄워줌)
	}
	
	@GetMapping("/page/users")
	public String getUsers() {
		return "UserList";
	}
}
