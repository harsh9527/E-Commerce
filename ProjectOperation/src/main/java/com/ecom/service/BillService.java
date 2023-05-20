package com.ecom.service;

import com.ecom.model.Bill;

public interface BillService {

	public Bill savebBill(Bill bill);
	
	//Design the Restful API to get the bill details By NILEISHDL
	public Bill getBillById(Integer id);
	
}
