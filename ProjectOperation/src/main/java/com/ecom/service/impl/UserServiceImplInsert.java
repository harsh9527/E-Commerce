
package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.User;
import com.ecom.repository.UserRepositoryInsert;
import com.ecom.service.UserServiceInsert;

@Service
public class UserServiceImplInsert implements UserServiceInsert {
	@Autowired
private UserRepositoryInsert userRepositoryInsert;
	@Override
	public User addUser(User user) {
return userRepositoryInsert.save(user);
	
	}

}
