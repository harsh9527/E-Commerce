package com.ecom.service;

import java.util.List;

import com.ecom.model.UserAddress;

public interface UserAddressService {

	public UserAddress saveUserAddress(UserAddress userAddress);

	public List<UserAddress> getAllUserAddress();

}
