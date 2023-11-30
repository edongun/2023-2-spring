package com.sg.leo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class RestPracticeController {
	@RequestMapping("/hello")
	public String hello() {
		return "return from /hello, RestPracticeController. 10/12 by 이동언";
	}
	
	@GetMapping("/get")
	public String get() {
		return "return from /get, RestPracticeController. 10/16 by 이동언";
	}
	
	@GetMapping(value = "/getchk/{variable}")
	public String getchk(@PathVariable String variable) {
		return "return from /get, RestPracticeController. 10/16 by 이동언: " + variable;
	}
	
	
	@GetMapping(value="/getparam")
	public String getparam(@RequestParam String name, String email) {
		return "return from/ getparam, name = " + name + "이메일 주소는= " + email;
	}
}
