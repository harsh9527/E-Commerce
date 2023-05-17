package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.repository.UserRepositoryDelete;
import com.ecom.service.UserServiceDelete;

@Service
public class UserServiceImplDelete implements UserServiceDelete {

	@Autowired
	private UserRepositoryDelete userRepositoryDelete;
	@Override
	public void deleteUser(Integer id) {

		userRepositoryDelete.deleteById(id);
	}

}
