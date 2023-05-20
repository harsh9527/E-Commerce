package com.ecom.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Payment;
import com.ecom.service.PaymentServiceFetch;

@RestController
public class PaymentControllerFetch {
	@Autowired
	private PaymentServiceFetch paymentServiceFetch;
	
	@GetMapping("/fetchPayment/{id}")
	public ResponseEntity<Optional<Payment>> getPaymentById(@PathVariable("id") Integer id){
		Optional<Payment> payment=paymentServiceFetch.getPaymentById(id);
		return ResponseEntity.ok().body(payment);
		
	}	

}
