package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.ExchangeValue;
import com.ecom.repository.ExchangeValueRepository;
import com.ecom.service.ExchangeValueService;
@Service
public class ExchangeValueServiceImpl implements ExchangeValueService {
	
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;

	@Override
	public ExchangeValue saveExchangeValue(ExchangeValue exchangeValue) {
		ExchangeValue ev=exchangeValueRepository.save(exchangeValue);
		return ev;
	}

	@Override
	public ExchangeValue getExchangeValueFromTo(String f, String t) {
		ExchangeValue exchangeValue=exchangeValueRepository.getExchangeValueFt(f, t);
		return exchangeValue;
	}
	
	 
	
	

}
