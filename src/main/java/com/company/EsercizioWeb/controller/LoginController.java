package com.company.EsercizioWeb.controller;

import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.EsercizioWeb.model.Administrator;

@RestController
public class LoginController 
{

	LinkedList<Administrator> list = new LinkedList<>();

	@PostMapping(value = "/login")
	public User createUser(@RequestBody User user)
	{
		return user;

	}//end login
//
//	@RequestMapping("/logout")
//	public String logout(HttpServletRequest request) throws ServletException 
//	{
//		request.logout();
//		return "redirect:/";
//	}

}//end
