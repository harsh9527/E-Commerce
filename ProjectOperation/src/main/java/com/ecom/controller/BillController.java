package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Bill;
import com.ecom.service.BillService;

@RestController
public class BillController {

	@Autowired
	private BillService service;

	@PostMapping("/saveBill")
	public ResponseEntity<Bill> saveBill(@RequestBody Bill bill) {
		Bill bill2 = service.savebBill(bill);
		return ResponseEntity.ok().body(bill2);
	}

	//Design the Restful API to get the bill details By NILEISHDL
	
	@GetMapping("/getBill/{id}")
	public ResponseEntity<Bill> getBillById(@PathVariable("id") Integer id) {

		Bill bill = service.getBillById(id);
		return ResponseEntity.ok().body(bill);

	}

}
