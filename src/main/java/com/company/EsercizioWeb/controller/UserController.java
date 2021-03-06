package com.company.EsercizioWeb.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController 
{
	
	@GetMapping("/login")
	public String displayLogin(Model model)
	{
		User user = new User();
		model.addAttribute("user", user);
		return "user_login";
	}
	
	@PostMapping("/login")
	public String procesLogin(@ModelAttribute("user") Model model)
	{
		return "home";
	}
	
}
