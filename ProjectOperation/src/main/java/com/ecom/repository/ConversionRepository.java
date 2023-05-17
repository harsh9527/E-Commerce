package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.CurrencyConversionBean;

@Repository
public interface ConversionRepository  extends JpaRepository<CurrencyConversionBean, Long>{

}
