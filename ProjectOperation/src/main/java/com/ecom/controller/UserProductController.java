package com.ecom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.repository.ProductRepositoryInsert;
import com.ecom.repository.UserRepository;

@RestController
@RequestMapping("/user/product")
public class UserProductController {

	private UserRepository userRepository;
	
	public UserProductController(UserRepository userRepository, ProductRepositoryInsert productRepositoryInsert) {
		super();
		this.userRepository = userRepository;
		this.productRepositoryInsert = productRepositoryInsert;
	}

	private ProductRepositoryInsert productRepositoryInsert;
}
