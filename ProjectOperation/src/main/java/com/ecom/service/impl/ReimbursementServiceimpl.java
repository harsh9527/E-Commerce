package com.ecom.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Reimbursement;
import com.ecom.repository.ReimbersementRepository;
import com.ecom.service.ReimbursementService;

@Service
public class ReimbursementServiceimpl implements ReimbursementService {

	@Autowired
	private ReimbersementRepository reimbersementRepository;

	@Override
	public Reimbursement saveReimbursement(Reimbursement reimbursement) {
		// TODO Auto-generated method stub
		return reimbersementRepository.save(reimbursement);
	}

	@Override
	public Reimbursement getReimbursement(int reimbursementId) {

		Optional<Reimbursement> reimbursement = reimbersementRepository.findById(reimbursementId);

		return reimbursement.get();
	}

	@Override
	public void deleteReimbursement(int reimbursementId) {

		reimbersementRepository.deleteById(reimbursementId);
	}

}
