package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.ExchangeValue;
import com.ecom.service.ExchangeValueService;

@RestController
public class ExchangeValueController {
	
	@Autowired
	private ExchangeValueService exchangeValueService;
	
	@PostMapping("/saveExchangeService")
	public ResponseEntity<ExchangeValue> saveExchangeValue(@RequestBody ExchangeValue exchangeValue) {
		ExchangeValue exchangeValue2=exchangeValueService.saveExchangeValue(exchangeValue);
		return ResponseEntity.ok().body(exchangeValue2);	
	}
	
	@GetMapping("/from/{from}/{to}")
	public ResponseEntity<ExchangeValue> getExchangeValue(@PathVariable String from,@PathVariable String to) {
		ExchangeValue ev=exchangeValueService.getExchangeValueFromTo(from, to);
		return ResponseEntity.ok().body(ev);
		
	}
	


}
