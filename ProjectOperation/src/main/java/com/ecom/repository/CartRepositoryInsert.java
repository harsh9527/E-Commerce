package com.ecom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Cart;

@Repository
public interface CartRepositoryInsert extends CrudRepository<Cart, Long> {

}
