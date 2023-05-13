package com.ecom.model;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bankaccount")
public class BankAccount {

	//one bank account has one customer
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accId;
	private int custId;
	private double balance;
	
	@OneToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
	private Customer customer;
	
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
