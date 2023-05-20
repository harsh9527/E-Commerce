package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.UserLogin;
import com.ecom.service.UserloginService;

@RestController
public class UserloginController {

	@Autowired
	private UserloginService service;
	
	@PostMapping("/saveUserLogin")
	public ResponseEntity<UserLogin> saveUserLogin(@RequestBody UserLogin login)
	{
		UserLogin login2=service.saveUserLogin(login);
		return ResponseEntity.ok().body(login2);
	}
	
}
