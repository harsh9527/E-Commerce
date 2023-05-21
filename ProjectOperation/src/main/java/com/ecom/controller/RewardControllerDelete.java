package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Reward;
import com.ecom.repository.RewardRepositoryDelete;

@RestController
public class RewardControllerDelete {
	@Autowired
	private RewardRepositoryDelete rewardRepositoryDelete;
	@DeleteMapping("/deleteReward/{id}")
	public void deleteReward(@PathVariable Integer id) {
		rewardRepositoryDelete.deleteById(id);
	}

}
