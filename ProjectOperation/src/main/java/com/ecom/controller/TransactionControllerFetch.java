package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Transaction;

import com.ecom.service.TransactionServiceFetch;

@RestController
public class TransactionControllerFetch {
	@Autowired
	private TransactionServiceFetch transactionServiceFetch;

	@GetMapping("/getTransactio/{id}")
	public Transaction getTransaction(@PathVariable("id") Integer id) {
		return transactionServiceFetch.getTransactionById(id);
	}
}
