package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.UserAddress;
import com.ecom.service.UserAddressServiceUpdate;

@RestController
public class UserAddressControllerUpdate {
	@Autowired
	private UserAddressServiceUpdate userAddressServiceUpdate;

	@PutMapping("/userAddressUpdate")
	public ResponseEntity<UserAddress> saveUserAddress(@RequestBody UserAddress userAddress) {
		UserAddress userAddress2 = userAddressServiceUpdate.updateUserAddress(userAddress);
		return ResponseEntity.ok().body(userAddress2);
	}
}