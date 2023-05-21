package com.ecom.service;



import com.ecom.model.Payment;

public interface PaymentServiceInsert {

	public Payment savePaymentDetails(Payment payment);
	
	public Payment updatePayment(Payment payment,int id);
}
