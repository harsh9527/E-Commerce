package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Payment;
import com.ecom.repository.PaymentRepositoryInsert;
import com.ecom.service.PaymentServiceInsert;

@Service
public class PaymentServiceImplInsert implements PaymentServiceInsert {

	@Autowired
	private PaymentRepositoryInsert paymentRepositoryInsert;

	@Override
	public Payment savePaymentDetails(Payment payment) {

		return paymentRepositoryInsert.save(payment);
	}

	@Override
	public Payment updatePayment(Payment payment, int id) {
		Payment p1=paymentRepositoryInsert.findById(id).get();
		p1.setAmount(payment.getAmount());
		p1.setCardno(payment.getCardno());
		p1.setCvv(payment.getCvv());
		p1.setExmonth(payment.getExmonth());
		p1.setExyear(payment.getExyear());
		p1.setNameoncard(payment.getNameoncard());
		p1.setPaymentmethod(payment.getPaymentmethod());
		p1.setPmtdate(payment.getPmtdate());
		
		return paymentRepositoryInsert.save(p1);
	}




	

	

}
