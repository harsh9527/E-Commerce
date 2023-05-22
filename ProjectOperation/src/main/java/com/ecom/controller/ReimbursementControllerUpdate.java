package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Reimbursement;
import com.ecom.service.ReimbursementService;

@RestController
public class ReimbursementControllerUpdate {

	@Autowired
	private ReimbursementService reimbursementService;

	// Design the Restful web services to update the reimbursement

	@PutMapping("/upadeReimbursement/{id}")
	public Reimbursement updateReimbursement(@PathVariable("id") int reimbursementId,
			@RequestBody Reimbursement reimbursement) {

		reimbursement.setReimbursementId(reimbursementId);
		return reimbursementService.saveReimbursement(reimbursement);

	}
}
