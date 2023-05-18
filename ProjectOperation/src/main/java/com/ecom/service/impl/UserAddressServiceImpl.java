package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.UserAddress;
import com.ecom.repository.UserAddressRepository;
import com.ecom.service.UserAddressService;

@Service
public class UserAddressServiceImpl implements UserAddressService {

	
	@Autowired
	private UserAddressRepository userAddressRepository;
	
	
	@Override
	public UserAddress saveUserAddress(UserAddress userAddress) {
	
		UserAddress userAddress2 = userAddressRepository.save(userAddress);
		
		return userAddress2;
	}

	
}
