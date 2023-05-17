package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.User;
import com.ecom.repository.UserRepositoryUpdate;
import com.ecom.service.UserServiceUpdate;


@Service
public class UserServiceImplUpdate implements UserServiceUpdate {

	@Autowired
	private UserRepositoryUpdate userRepositoryUpdate;
	
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepositoryUpdate.save(user);
	}

	
}
