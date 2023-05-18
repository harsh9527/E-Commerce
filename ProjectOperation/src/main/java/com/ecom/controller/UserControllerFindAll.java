package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.User;
import com.ecom.service.UserServiceFindAll;

@RestController
public class UserControllerFindAll {
	@Autowired
	private UserServiceFindAll userServiceFindAll;
	
	@GetMapping("/getAllUsers")
	public List<User> findAllUsers(){
		return userServiceFindAll.getAllUsers();
		
	}
	

}
