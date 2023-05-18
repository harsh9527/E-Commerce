package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.service.UserAddressServiceDelete;

@RestController
public class UserAddressControllerDelete {
	@Autowired
	private UserAddressServiceDelete userDelete;
	@DeleteMapping("/deleteUserAddress/{id}")
	public void deleteUserAddress(@PathVariable Integer id) {
		userDelete.deleteById(id);
	}
	
}
