package com.ecom.service;

import java.util.Optional;

import com.ecom.model.Payment;

public interface PaymentServiceFetch {
	public Optional<Payment> getPaymentById( Integer id);


}
