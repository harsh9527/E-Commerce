package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.UserAddress;
import com.ecom.service.UserAddressServiceFetch;

@RestController
public class UserAddressControllerFetch {

	@Autowired
	private UserAddressServiceFetch userAddressServiceFetch;

	// Design The API to Fetch Data from UserAddress

	@GetMapping("/userAddressFrom/{id}")
	public UserAddress getUserAddressDetails(@PathVariable("id") Integer id) {
		return userAddressServiceFetch.getUserAddress(id);

	}

}
