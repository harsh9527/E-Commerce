package com.ecom.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Payment;
import com.ecom.repository.PaymentRepositoryFetch;
import com.ecom.service.PaymentServiceFetch;

@Service
public class PaymentServiceImplFetch implements PaymentServiceFetch {
	@Autowired
	private PaymentRepositoryFetch paymentRepositoryFetch;

	@Override
	public Optional<Payment> getPaymentById(Integer id) {
		Optional<Payment> payment=paymentRepositoryFetch.findById(id);
	return payment;	
	}
}
