package com.ecom.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.ecom.model.Cart;
import com.ecom.model.CartImage;

public interface CartServiceInsert {

	public Cart addCart(Cart cart);

	public CartImage upoadImage(MultipartFile mFile) throws IOException;
}
