package com.yosh.springboot.app.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@Value("${application.controller.title}")
	private String title;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("title", this.title);
		
		return "index";
	}
	
}
