package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ecom.model.User;
import com.ecom.service.UserServiceInsert;

@RestController
public class UserControllerInsert {
	@Autowired
	private UserServiceInsert userServiceInsert;
	@PostMapping("/insertUserData")
	public ResponseEntity<User>  addToUser(@RequestBody User user) {
	User user1=	userServiceInsert.addUser(user);
	return ResponseEntity.ok().body(user1);
	}

}
