package com.ecom.service;

import com.ecom.model.Reward;
import com.ecom.model.User;

public interface UserService {

	public User saveUSer(User user);

	public User userLogin(User user);

	public User updateUser(User user, int id);

	public void deleteUser(int id);

	public Reward saveReward(Reward reward);

}
