package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.UserAddress;
import com.ecom.service.UserAddressService;

@RestController
public class UserAddressController {

	@Autowired
	private UserAddressService userAddressService;

	
	@PostMapping("/saveUserAddress")
	public ResponseEntity<UserAddress> saveUserAddress(@RequestBody UserAddress userAddress) {
		UserAddress userAddress2 = userAddressService.saveUserAddress(userAddress);
		return ResponseEntity.ok().body(userAddress2);

	}

}
