package com.ecom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Cart;

@Repository
public interface CartRepositoryFetch extends CrudRepository<Cart, Long> {

	
	public Cart getByCartId(Long cartId);
	
}
