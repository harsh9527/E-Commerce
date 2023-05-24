package com.ecom.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ecom.service.BikeService;
import com.ecom.service.CartServiceInsert;
import com.ecom.model.Bike;
import com.ecom.model.Cart;
//import com.ecom.model.CartImage;


@RestController
public class CartControllerInsert {

	@Autowired
	private CartServiceInsert cartService;
	
	@Autowired
	private BikeService bikeService;

	@PostMapping("/cart")
	public ResponseEntity<Cart> addToCart(@RequestBody Cart cart) {
		Cart cart2=cartService.addCart(cart);
		List<Bike> bikes=cart.getBikeList();
		int price=0;
		for(Bike bike:bikes)
		{
			price=price+bike.getPrice();
			bikeService.savBike(bike);
		}
		cart2.setPrice(price);
		return ResponseEntity.ok().body(cart2);
	}

	
	//design the rest api to upload the file into database
	@PostMapping("/uploadImage")
	public Cart upoadImage(@RequestParam("mFile") MultipartFile mFile) throws IOException {
		
		return cartService.upoadImage(mFile);
		
		
	}
}