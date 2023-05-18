package com.ecom.service;

import java.util.List;

import com.ecom.model.User;



public interface UserService {

	public User saveUSer(User user);
	
	public User userLogin(User user);
	
	public List<User> getUsers();
	
}
