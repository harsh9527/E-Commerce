package com.ecom.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.UserAddress;
import com.ecom.repository.UserAddressRepositoryFetch;
import com.ecom.service.UserAddressServiceFetch;
@Service
public class UserAddressServiceImplFetch implements UserAddressServiceFetch {

	@Autowired
	private UserAddressRepositoryFetch userAddressRepositoryFetch;
	@Override
	public UserAddress getUserAddress(Integer id) {
		// TODO Auto-generated method stub
		Optional<UserAddress> userAddress=userAddressRepositoryFetch.findById(id);
		return userAddress.get();
	}

}
