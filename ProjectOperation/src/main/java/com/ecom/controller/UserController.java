package com.ecom.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.OrderDetails;
import com.ecom.model.Product;
import com.ecom.model.Reward;
import com.ecom.model.User;
import com.ecom.repository.OrderDetailsRepository;
import com.ecom.repository.ProductRepositoryInsert;
import com.ecom.repository.UserRepository;
import com.ecom.service.OrderDetailsService;
import com.ecom.service.ProductServiceInsert;
import com.ecom.service.RewardService;
import com.ecom.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@Autowired
	private RewardService rewardService;
	
	@Autowired
	private OrderDetailsService detailsService;
	
	@Autowired
	private ProductServiceInsert productServiceInsert;
	
	@Autowired
	private OrderDetailsService orderDetailsService;
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	
	@Autowired
	private ProductRepositoryInsert productRepositoryInsert;
	
	@PostMapping("/saveReward")
	public ResponseEntity<Reward> saveReward(@RequestBody Reward reward)
	
	{
		Reward reward2=rewardService.saveReward(reward);
		return ResponseEntity.ok().body(reward2);
	}
	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User user2 = service.saveUSer(user);
		return ResponseEntity.ok().body(user2);
	}

	@GetMapping("/userLogin")
	public User userlogin(@RequestBody User user) {
		User user2 = service.userLogin(user);
		return user2;
	}

	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable("id") int id) {
		User user2 = service.updateUser(user, id);
		return ResponseEntity.ok().body(user2);
	}

	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		service.deleteUser(id);
		System.out.println("Deleted User Successfully");
	}
	
	
	
	
	@PostMapping("/saveProductDetails")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product)
	{
		Product product2=productServiceInsert.saveProduct(product);
		return ResponseEntity.ok().body(product2);
				
				
	}
	
	@PostMapping("/saveUserWithProduct")
	@ResponseBody
	public ResponseEntity<User> getUserWithProduct(@RequestBody User user)
	{
		User user2=service.saveUSer(user);
		List<OrderDetails> details=user.getDetails();
		
		for(OrderDetails details2:details)
		{
			details2.setUserId(user.getId());
			OrderDetails orderDetails=orderDetailsService.saveOrderDetails(details2);
			Set<Product> product1=orderDetails.getProducts();
			for(Product product:product1)
			{
			  	productRepositoryInsert.save(product);
			}
			
		}

		return ResponseEntity.ok().body(user2);
	}
	
	
	@GetMapping("/getAllUserProducts")
	public List<Object[]> getAllUserProducts(){
		return userRepository.findAllUserProducts();
		
		
	}
	
	

}
