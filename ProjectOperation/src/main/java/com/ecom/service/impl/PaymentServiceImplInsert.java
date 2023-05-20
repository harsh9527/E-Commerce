package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Payment;
import com.ecom.repository.PaymentRepositoryInsert;
import com.ecom.service.PaymentServiceInsert;

@Service
public class PaymentServiceImplInsert implements PaymentServiceInsert {

	@Autowired
	private PaymentRepositoryInsert paymentRepositoryInsert;

	@Override
	public Payment savePaymentDetails(Payment payment) {

		return paymentRepositoryInsert.save(payment);
	}

}
