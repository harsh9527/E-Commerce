package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Reimbursement;
import com.ecom.service.ReimbursementService;

@RestController
public class ReimbursementController {

	@Autowired
	private ReimbursementService reimbursementService;
	
	@PostMapping("/saveReimbursement")
	public ResponseEntity<Reimbursement> saveReimbursement(@RequestBody Reimbursement reimbursement)
	{
		Reimbursement reimbursement2=reimbursementService.saveReimbursement(reimbursement);
		return ResponseEntity.ok().body(reimbursement2);
		
	}
	
}
