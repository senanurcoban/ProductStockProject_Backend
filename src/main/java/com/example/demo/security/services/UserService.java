package com.example.demo.security.services;

import org.springframework.stereotype.Service;

import com.example.demo.dataAccess.abstracts.UserRepository;

@Service
public class UserService {

	UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	
}
