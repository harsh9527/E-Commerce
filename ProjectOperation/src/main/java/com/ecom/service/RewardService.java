package com.ecom.service;

import java.util.List;

import com.ecom.model.Reward;

public interface RewardService {

	//task 84 ADD Reward details by NILEISHDL
	public Reward saveReward(Reward reward);
	public List<Reward> getAllRewards();
}
