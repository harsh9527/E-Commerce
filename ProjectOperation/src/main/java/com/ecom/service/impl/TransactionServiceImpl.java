package com.ecom.service.impl;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.repository.TransactionRepository;
import com.ecom.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public com.ecom.model.Transaction saveTransaction(com.ecom.model.Transaction transaction) {
		com.ecom.model.Transaction transaction2 = transactionRepository.save(transaction);

		return transaction2;
	}

}
