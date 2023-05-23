package com.ecom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Transaction;

@Repository
public interface TransactionRepositoryFetch extends CrudRepository<Transaction, Integer> {

}

