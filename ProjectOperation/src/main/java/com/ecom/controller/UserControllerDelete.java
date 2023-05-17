package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.service.UserServiceDelete;

@RestController
public class UserControllerDelete {

	@Autowired
	private UserServiceDelete userServiceDelete;
	
	//Design APIfor User Delete operation
	@DeleteMapping("/userDelete/{id}")
	public void getDelete(@PathVariable Integer id) {
		
		userServiceDelete.deleteUser(id);
	}
}
