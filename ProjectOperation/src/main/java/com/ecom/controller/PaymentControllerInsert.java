package com.ecom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Payment;
import com.ecom.service.PaymentServiceInsert;

@RestController
public class PaymentControllerInsert {

	@Autowired
	private PaymentServiceInsert paymentServiceInsert;

	// Design Restful API to add the payment details for purchasing order from user.

	@PostMapping("/paymentsDetails")
	public Payment savePaymentDetails(@RequestBody Payment payment) {

		return paymentServiceInsert.savePaymentDetails(payment);

	}
	
	@PutMapping("/updatePayments/{id}")
	public Payment updatePayment(@RequestBody Payment payment,@PathVariable int id) {
		return paymentServiceInsert.updatePayment(payment, id);
		
		
		
	}
	
		
	
}
