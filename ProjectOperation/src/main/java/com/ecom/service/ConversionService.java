package com.ecom.service;

import java.util.Optional;

import com.ecom.model.CurrencyConversionBean;


public interface ConversionService {

	
	public CurrencyConversionBean saveConversionBean(CurrencyConversionBean currencyConversionBean);
	
	public Optional<CurrencyConversionBean> getConversionDetails(Long id);
	
	public void deleteConversionBean(Long id);
	
	public void updateConversionBean(CurrencyConversionBean bean,Long id);
	
	public java.util.List<CurrencyConversionBean> getAllConversion();

	
}
