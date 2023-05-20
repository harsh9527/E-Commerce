package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.UserLogin;
import com.ecom.repository.UserloginRepository;
import com.ecom.service.UserloginService;

@Service
public class UserloginServiceImpl  implements UserloginService{

	@Autowired
	private UserloginRepository repository;
	
	@Override
	public UserLogin saveUserLogin(UserLogin login) {
		// TODO Auto-generated method stub
		return repository.save(login);
	}

	
	
}
