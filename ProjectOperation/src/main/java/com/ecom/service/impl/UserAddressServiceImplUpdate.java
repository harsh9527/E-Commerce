package com.ecom.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.UserAddress;
import com.ecom.repository.UserAddressRepositoryUpdate;
import com.ecom.service.UserAddressServiceUpdate;

@Service
public class UserAddressServiceImplUpdate implements UserAddressServiceUpdate{
	@Autowired
private UserAddressRepositoryUpdate userAddressRepositoryUpdate;
	@Override
	public UserAddress updateUserAddress(UserAddress userAddress) {
		
		return userAddressRepositoryUpdate.save(userAddress);
	}

}
