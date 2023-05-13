package com.ecom.service;

import com.ecom.model.ExchangeValue;

public interface ExchangeValueService {
	public ExchangeValue saveExchangeValue(ExchangeValue exchangeValue);
	public ExchangeValue getExchangeValueFromTo(String f,String t);
}
