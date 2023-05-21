package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Reward;
import com.ecom.model.User;
import com.ecom.service.RewardService;
import com.ecom.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private RewardService rewardService;
	
	@PostMapping("/userReward")
	public User saveUserReward(@RequestBody User user) {
		
		User user3=service.saveUSer(user);
		List<Reward> rewards= user.getRewardList();
		
		for(Reward reward:rewards) {
			
			reward.setId(user.getId());
			service.saveReward(reward);
			
		}
		
		
		return user3;
		
	}
	
	
	
	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user)
	{
		User user2=service.saveUSer(user); 
		return ResponseEntity.ok().body(user2);
	}
	
	@GetMapping("/userLogin")
	public User userlogin(@RequestBody User user)
	{
		 User user2=service.userLogin(user);
		 return user2;
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable("id") int id)
	{
		User user2=service.updateUser(user,id);
		return ResponseEntity.ok().body(user2);		
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable("id") int id)
	{
		 service.deleteUser(id);
		 System.out.println("Deleted User Successfully");
	}
	
	
}
