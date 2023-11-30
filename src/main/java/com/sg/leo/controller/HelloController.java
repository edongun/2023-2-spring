package com.sg.leo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/html")
	public String html() {
		System.out.println("HTML파일이 요청됨");
		return "redirect:myspring.html";
	}
	
	@GetMapping("/img")
	public String img() {
		System.out.println("이미지 파일이 요첨됨");
		return "redirect:image/rabbit.jpg";
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("jsp파일이 요청됨");
		model.addAttribute("username","흐흠 이 콘텐츠 주인, 이동언");
		return "hellojsp";
	}
	
}
