package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Reward;
import com.ecom.repository.RewardRepository;
import com.ecom.service.RewardService;


@Service
public class RewardServiceImpl implements RewardService{

	@Autowired
	private RewardRepository rewardRepository;
	@Override
	public Reward saveReward(Reward reward) {
		// TODO Auto-generated method stub
		Reward rewards=rewardRepository.save(reward);
		return rewards;
	}

}
