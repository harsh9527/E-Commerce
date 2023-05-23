package com.ecom.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecom.model.Transaction;
import com.ecom.repository.TransactionRepositoryFetch;
import com.ecom.service.TransactionServiceFetch;

@Service
public class TransactionServiceImplFetch implements TransactionServiceFetch {
	@Autowired
private TransactionRepositoryFetch transactionRepositoryFetch;

	@Override
	public Transaction getTransactionById(Integer id) {
		Optional<Transaction> transaction=	transactionRepositoryFetch.findById(id);	
		return transaction.get();
	}
	
		
	}



