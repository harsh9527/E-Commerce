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

	//Design the Restful API to get the bill details By NILEISHDL

	@Override
	public Bill getBillById(Integer id) {
		// TODO Auto-generated method stub
	    Bill bill = repository.findByBid(id);
		return bill;
	}

	@Override
	public Bill updateBill(Bill bill, Integer id) {
		Bill b1=repository.findByBid(id);
		b1.setBillCode(bill.getBillCode());
		b1.setBillCom(bill.getBillCom());
		b1.setBillName(bill.getBillName());
		b1.setBillNum(bill.getBillNum());
		b1.setMoney(bill.getMoney());
		b1.setPid(bill.getPid());
		return repository.save(b1);
		
	}

	

	
	
}
