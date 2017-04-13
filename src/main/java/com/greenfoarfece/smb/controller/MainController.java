package com.greenfoarfece.smb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.greenfoarfece.smb.service.PersonService;
import com.greenfoarfece.smb.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	@Qualifier("personService")
	private PersonService personSvc;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getHome(Model model) {
		model.addAttribute("user", userService.getUser());
    	return "index";
    }
	
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public String getPerson(Model model) {
		model.addAttribute("person", personSvc.getPerson());
		return "index2";
	}
	

}
