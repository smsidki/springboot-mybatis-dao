package com.greenfoarfece.smb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.greenfoarfece.smb.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/home",method = RequestMethod.GET)
    public String login(Model model){
		model.addAttribute("user",userService.getUser());
    	return "index";
    }

}
