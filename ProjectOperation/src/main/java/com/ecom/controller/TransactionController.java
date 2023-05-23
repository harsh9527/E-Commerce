package com.ecom.controller;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	private TransactionService transactionService;

	@PostMapping("/saveTransaction")
	public ResponseEntity<com.ecom.model.Transaction> saveTransaction(
			@RequestBody com.ecom.model.Transaction transaction) {
		com.ecom.model.Transaction transaction3 = transactionService.saveTransaction(transaction);
		return ResponseEntity.ok().body(transaction3);
	}

}
