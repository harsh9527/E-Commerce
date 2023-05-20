package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Reimbursement;
import com.ecom.repository.ReimbersementRepository;
import com.ecom.service.ReimbursementService;

@Service
public class ReimbursementServiceimpl  implements ReimbursementService{

	@Autowired
	private ReimbersementRepository reimbersementRepository;
	
	@Override
	public Reimbursement saveReimbursement(Reimbursement reimbursement) {
		// TODO Auto-generated method stub
		return reimbersementRepository.save(reimbursement);
	}

}
