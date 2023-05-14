package com.ecom.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ecom.model.Cart;
import com.ecom.model.CartImage;
import com.ecom.repository.CartImageRepositoryInsert;
import com.ecom.repository.CartRepositoryInsert;
import com.ecom.service.CartServiceInsert;

@Service
public class CartServiceImplInsert implements CartServiceInsert {

	@Autowired
	private CartRepositoryInsert cartRepository;

	@Override
	public Cart addCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Autowired
	private CartImageRepositoryInsert cartImageInsert; 
	@Override
	public CartImage upoadImage(MultipartFile mFile) throws IOException {
		//data pass through constructor or setter base
		
		CartImage cartImage =new CartImage(mFile.getOriginalFilename(), mFile.getContentType(), mFile.getBytes());
		return cartImageInsert.save(cartImage);
	}
}
