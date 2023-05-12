package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Provider;
import com.ecom.service.ProviderServiceFetch;

@RestController
public class ProviderControllerFetch {
	
	@Autowired
	ProviderServiceFetch providerServiceFetch;
	
	@GetMapping("/fetchProvider/{id}")
	public ResponseEntity<Provider> getProviderById(@PathVariable("id") Integer id){
		Provider provider=providerServiceFetch.getProviderById(id);
		return ResponseEntity.ok().body(provider);
		
		
	}

}
