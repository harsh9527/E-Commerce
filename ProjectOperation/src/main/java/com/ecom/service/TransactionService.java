package com.ecom.service;

import javax.transaction.Transaction;

public interface TransactionService {
	public com.ecom.model.Transaction saveTransaction(com.ecom.model.Transaction transaction);

}
 