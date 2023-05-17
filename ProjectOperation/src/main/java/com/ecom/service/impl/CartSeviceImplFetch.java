package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Cart;
import com.ecom.repository.CartRepositoryFetch;
import com.ecom.service.CartServiceFetch;

@Service
public class CartSeviceImplFetch implements CartServiceFetch {

	@Autowired
	private CartRepositoryFetch cartRepositoryFetch;

	@Override
	public Cart getCart(Long id) {
		Cart cart = cartRepositoryFetch.getByCartId(id);
		return cart;
	}

}
