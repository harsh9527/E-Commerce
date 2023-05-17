package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.User;
import com.ecom.repository.UserRepository;
import com.ecom.service.UserService;

@Service
public class UserServciseImpl implements UserService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public User saveUSer(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public User userLogin(User user) {
		// TODO Auto-generated method stub
		return repository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}

	
}
