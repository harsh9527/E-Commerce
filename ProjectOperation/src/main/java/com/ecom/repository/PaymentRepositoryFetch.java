package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Payment;

@Repository
public interface PaymentRepositoryFetch extends JpaRepository<Payment, Integer>{
	
}
