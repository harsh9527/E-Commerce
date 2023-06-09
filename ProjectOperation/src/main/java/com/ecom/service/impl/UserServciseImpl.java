package com.ecom.service.impl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Reward;
import com.ecom.model.User;
import com.ecom.repository.UserRepository;
import com.ecom.service.UserService;

@Service
public class UserServciseImpl implements UserService {

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

	@Override
	public User updateUser(User user, int id) {

		User user2=repository.findById(id);
		user2.setUsername(user.getUsername());
		user2.setFullName(user.getFullName());
		user2.setEmail(user.getEmail());
		user2.setPassword(user.getPassword());
		user2.setPrimaryMobile(user.getPrimaryMobile());
		user2.setSecondaryMobile(user.getSecondaryMobile());
		user2.setDob(user.getDob());
		user2.setRefferalInfo(user.getRefferalInfo());
		user2.setRefferalType(user.getRefferalType());
		user2.setAddress(user.getAddress());
		user2.setCity(user.getCity());
		user2.setState(user.getState());
		return repository.save(user2);

	}

	@Override
	public void deleteUser(int id) {
		repository.deleteById(id);
	}

	@Override
	public Reward saveReward(Reward reward) {
		// TODO Auto-generated method stub
		return (Reward) repository.save(reward);
	}



	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Object[]> getUserProducts() {
	return repository.findAllUserProducts();
		
	}

	

}
