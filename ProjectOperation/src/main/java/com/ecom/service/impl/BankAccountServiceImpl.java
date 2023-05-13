package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.BankAccount;
import com.ecom.repository.BankAccountRepository;
import com.ecom.service.BankAccountService;


@Service
public class BankAccountServiceImpl implements BankAccountService {

	
	@Autowired
	private BankAccountRepository bankAccountRepository;
	@Override
	public BankAccount saveBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
	   BankAccount bankAccount1 =bankAccountRepository.save(bankAccount);
		
		return bankAccount1;
	}

	
	
	
}
