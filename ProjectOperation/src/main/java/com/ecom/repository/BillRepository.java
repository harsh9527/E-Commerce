package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer>{

	public Bill findByBid(Integer bid);
}
