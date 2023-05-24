package com.ecom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.User;
import com.ecom.repository.UserRepositoryFinAll;
import com.ecom.service.UserServiceFindAll;

@Service
public class UserServiceFindAllImpl implements UserServiceFindAll {
	@Autowired
	private UserRepositoryFinAll userRepositoryFindAll;

	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepositoryFindAll.findAll();
	}

}
