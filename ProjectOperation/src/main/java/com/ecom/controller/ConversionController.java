package com.ecom.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.CurrencyConversionBean;
import com.ecom.service.ConversionService;

@RestController
public class ConversionController {

	@Autowired
	private ConversionService conversionService;
	
	
	@PostMapping("conversionInsert")
	public ResponseEntity<CurrencyConversionBean> saveEntity(@RequestBody CurrencyConversionBean bean)
	{
		bean.setTotalCalculatedAmount(bean.getQuantity().multiply(bean.getConversionMultiple()));
		CurrencyConversionBean bean2=conversionService.saveConversionBean(bean);
		return ResponseEntity.ok().body(bean2);
	}
	
	@PutMapping("/updateConversion/{id}")
	public CurrencyConversionBean updateEntity(@RequestBody CurrencyConversionBean bean,@PathVariable("id") long id)
	{
		bean.setTotalCalculatedAmount(bean.getQuantity().multiply(bean.getConversionMultiple()));
		conversionService.updateConversionBean(bean,id);
	   
	    return bean;
	    
		
	}
	
	
	@DeleteMapping("/deleteConversion/{id}")
	public void deleteConversion(@PathVariable long id) throws Exception
	{
		conversionService.deleteConversionBean(id);
	}
	
	
	@GetMapping("/getDetails/{id}")
	public ResponseEntity<Optional<CurrencyConversionBean>> getConversionDetails(@PathVariable("id") long id)
	{
		Optional<CurrencyConversionBean> bean=conversionService.getConversionDetails(id);
		return ResponseEntity.ok().body(bean);
	}
	
	@GetMapping("/getAllConversion")
	public List<CurrencyConversionBean> getAllConversion()
	{
		return conversionService.getAllConversion();
		
	}

}
	
