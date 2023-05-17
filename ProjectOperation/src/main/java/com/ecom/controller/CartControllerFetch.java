package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Cart;
import com.ecom.service.CartServiceFetch;

@RestController
public class CartControllerFetch {

	@Autowired
	private CartServiceFetch cartServiceFetch;
	
	
	@GetMapping("/getCartDetails/{id}")
	public Cart getCart(@PathVariable("id") Long cartId) {
	
		Cart cart =	cartServiceFetch.getCart(cartId);

		return cart;

	}

}
