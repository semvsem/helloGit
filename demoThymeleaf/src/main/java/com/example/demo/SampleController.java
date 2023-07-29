package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@RequestMapping("/")
	String sample(Model model) {
		model.addAttribute("name", "三郎");
		
		int a=2;
		int b=5;
		int age=a*b;
		
		model.addAttribute("age", age);
		
		return "hello";
	}
	
}
