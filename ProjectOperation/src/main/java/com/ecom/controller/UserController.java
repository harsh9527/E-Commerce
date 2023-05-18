package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.User;
import com.ecom.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user)
	{
		User user2=service.saveUSer(user); 
		return ResponseEntity.ok().body(user2);
	}
	
	@GetMapping("/userLogin")
	public User userlogin(@RequestBody User user)
	{
		 User user2=service.userLogin(user);
		 return user2;
	}
	
	@GetMapping("/getUsers")
	public List<User> getAllUsers(){
		return service.getUsers();
		
	}
	
}
