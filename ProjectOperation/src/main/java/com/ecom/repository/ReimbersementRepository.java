package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Reimbursement;

@Repository
public interface ReimbersementRepository extends JpaRepository<Reimbursement, Integer>{

}
