package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.BankAccount;
import com.ecom.service.BankAccountService;

@RestController
public class BankAccountController {

	@Autowired
	private BankAccountService bankAccountService;

	@PostMapping("/saveBankAccountCustomer")
	public BankAccount saveBankAccountDetails(@RequestBody BankAccount bankAccount) {

		BankAccount bankAccounts = bankAccountService.saveBankAccount(bankAccount);

		return bankAccounts;

	}

}
