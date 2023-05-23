package com.ecom.service;

import com.ecom.model.Reimbursement;

public interface ReimbursementService {

	public Reimbursement saveReimbursement(Reimbursement reimbursement);

	public Reimbursement getReimbursement(int reimbursementId);

	public void deleteReimbursement(int reimbursementId);
}
