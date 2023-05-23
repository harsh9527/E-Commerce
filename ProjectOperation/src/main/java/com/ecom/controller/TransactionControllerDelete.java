package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.service.TransactionServiceDelete;

@RestController
public class TransactionControllerDelete {
	@Autowired
	private TransactionServiceDelete transactionServiceDelete;
	
	@DeleteMapping("/deleteTransaction/{id}")
	public void deleteTransaction(@PathVariable Integer id) {
		transactionServiceDelete.deleteById(id);
	}
}
