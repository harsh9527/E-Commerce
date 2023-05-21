package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.repository.RewardRepositoryDelete;
import com.ecom.service.RewardServiceDelete;

@Service
public class RewardServiceImplDelete implements RewardServiceDelete{
	@Autowired
private RewardRepositoryDelete rewardRepositoryDelete;
	@Override
	public void deleteById(Integer id) {
		
		rewardRepositoryDelete.deleteById(id);
	}

}
