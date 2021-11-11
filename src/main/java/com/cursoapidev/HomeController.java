package com.cursoapidev;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	private final HomeService service;

	public HomeController(HomeService service) {
		this.service = service;
	}
	
	@RequestMapping("home")
	public @ResponseBody String greeting() {
		return service.home();
	}
	
	@RequestMapping("/hi")
	public @ResponseBody String hiThere() {
		
		return "Hello world";
	}
	
	@RequestMapping("/hi2")
	public String hi2() {
		
		return "hello";
	}
	
	/*
	@RequestMapping("/hi/{name}")
	public String hiThere(Map model, @PathVariable String name) {
		
		model.put("name", name);
		return "hello";
	}*/
}
