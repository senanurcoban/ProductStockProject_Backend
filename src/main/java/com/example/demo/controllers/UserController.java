package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.security.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
}
