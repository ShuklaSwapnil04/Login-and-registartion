package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.model.UserLogin;


@Controller
public class LoginController {
	
	
	
	@RequestMapping("/")
	public String login(@ModelAttribute("obj") UserLogin user)
	{
		
		return "login";
		
	}
	
	@RequestMapping("/login-panel")
	public String home(@ModelAttribute("obj") UserLogin user , Model model , @RequestParam("action") String click)
	{
		if(click.equalsIgnoreCase("login"))
		{
		if(user.getUserName().equals("abc") && user.getUserPassword().equals("123"))
		{
	
		return "home";
		}
		else
		{
			model.addAttribute("msg","Invalid!");
			return "login";
		}}
		
		else if(click.equalsIgnoreCase("register"))
		{
			return "redirect:/registration";
		}
		return "login";
	}

}
