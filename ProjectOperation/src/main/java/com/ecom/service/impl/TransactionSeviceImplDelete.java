package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.repository.TransactionRepositoryDelete;
import com.ecom.service.TransactionServiceDelete;
@Service
public class TransactionSeviceImplDelete implements TransactionServiceDelete{
	@Autowired
private TransactionRepositoryDelete transactionRepositoryDelete;
	
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		transactionRepositoryDelete.deleteById(id);
	}
		
	}


