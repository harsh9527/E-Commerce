package com.ecom.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.ecom.service.CartServiceInsert;
import com.ecom.model.Cart;
//import com.ecom.model.CartImage;


@RestController
public class CartControllerInsert {

	@Autowired
	private CartServiceInsert cartService;

	@PostMapping("/cart")
	public Cart addToCart(@RequestBody Cart cart) {
		return cartService.addCart(cart);
	}

	
	//design the rest api to upload the file into database
	@PostMapping("/uploadImage")
	public Cart upoadImage(@RequestParam("mFile") MultipartFile mFile) throws IOException {
		
		return cartService.upoadImage(mFile);
		
		
	}
}