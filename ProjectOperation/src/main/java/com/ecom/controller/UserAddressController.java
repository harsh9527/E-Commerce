package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.User;
import com.ecom.model.UserAddress;
import com.ecom.service.UserAddressService;
import com.ecom.service.UserService;

@RestController
public class UserAddressController {

	@Autowired
	private UserAddressService userAddressService;

	@Autowired
	private UserService userService;

	@PostMapping("/saveUserAddress")
	public ResponseEntity<UserAddress> saveUserAddress(@RequestBody UserAddress userAddress) {
		UserAddress userAddress2 = userAddressService.saveUserAddress(userAddress);
		return ResponseEntity.ok().body(userAddress2);

	}

	@RequestMapping("/UserAddress")

	public ResponseEntity<User> userAddress(@RequestBody User user) {

		User user1 = userService.saveUSer(user);
		List<UserAddress> userAddress2 = user.getUserAddressList();

		for (UserAddress address : userAddress2) {

			address.setUsersId(user.getId());
			userAddressService.saveUserAddress(address);
		}
		return ResponseEntity.ok().body(user1);
	}

	// Design Restful web services in which user should able to get many address
		// from database based on user id
	
	@GetMapping("/getAllUsersAddress")
	public List<UserAddress> findAllUsersAddress() {
		return userAddressService.getAllUserAddress();

	}

	

}
