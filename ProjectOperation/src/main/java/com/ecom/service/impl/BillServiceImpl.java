package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Bill;
import com.ecom.repository.BillRepository;
import com.ecom.service.BillService;

@Service
public class BillServiceImpl implements BillService{

	@Autowired
	private BillRepository repository;
	
	
	@Override
	public Bill savebBill(Bill bill) {
		// TODO Auto-generated method stub
		return repository.save(bill);
	}

	
	
}
