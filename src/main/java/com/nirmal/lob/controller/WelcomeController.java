package com.nirmal.lob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="welcome")
	public String getWelcome(Model model){
		model.addAttribute("greeting","Hi nirmal eka wada");
		return "welcome";
	}

}
