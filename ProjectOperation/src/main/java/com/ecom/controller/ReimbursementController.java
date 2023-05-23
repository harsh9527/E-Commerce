package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<Reimbursement> saveReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement reimbursement2 = reimbursementService.saveReimbursement(reimbursement);
		return ResponseEntity.ok().body(reimbursement2);

	}

	// Design Restful API to get user address from database

	@GetMapping("/fetchReimbursement/{id}")
	public Reimbursement getReimbursement(@PathVariable("id") int reimbursementId) {
		return reimbursementService.getReimbursement(reimbursementId);

	}

	// Design the Restful web services to delete the reimbursement
	@DeleteMapping("/deleteReimbursement/{id}")
	public void deleteReimbursement(@PathVariable("id") @RequestBody int reimbursementId) {
		reimbursementService.deleteReimbursement(reimbursementId);
	}

}
