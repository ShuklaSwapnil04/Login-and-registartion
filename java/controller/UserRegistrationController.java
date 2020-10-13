package com.webapp.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.webapp.model.UserReg;


@Controller
public class UserRegistrationController {
	
	

	@RequestMapping("/registration")
	public ModelAndView register()
	{
		return new ModelAndView ("register", "objReg",new UserReg());
	}
	
	@ModelAttribute("countryList")
	public Map<String, String> countries()
	{
		Map<String,String> map= new HashMap<String,String>();
		map.put("In", "India");
		map.put("Usa", "United States of America");
		map.put("Uk", "United Kingdom");
		return map;
	}
	
	
	@RequestMapping("/processRegistration")
	public ModelAndView processRegister(@ModelAttribute("objReg") UserReg user)
	{
	

	
		return new ModelAndView ("register","objReg",new UserReg("registration failed"));
	}
	}
