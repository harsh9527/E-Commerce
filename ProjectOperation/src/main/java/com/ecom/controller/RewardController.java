package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Reward;
import com.ecom.service.RewardService;

@RestController
public class RewardController {
	
	@Autowired
	private RewardService rewardService;
	
	@GetMapping("/findAllRewards")
	public List<Reward> getAllRewards(){
		return rewardService.getAllRewards();
		
	}

}
