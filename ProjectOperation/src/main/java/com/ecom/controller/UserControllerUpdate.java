package com.ecom.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ecom.model.User;
import com.ecom.service.UserServiceUpdate;


@RestController
public class UserControllerUpdate {

	@Autowired
	private UserServiceUpdate userServiceUpdate;

	@PutMapping("/updateUserData")
	public ResponseEntity<User> saveUser(@RequestBody User user) {

		User user2 = userServiceUpdate.updateUser(user);

		return ResponseEntity.ok().body(user2);

	}

}
