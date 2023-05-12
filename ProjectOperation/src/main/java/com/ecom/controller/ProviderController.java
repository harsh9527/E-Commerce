package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Provider;
import com.ecom.service.ProviderService;

@RestController
public class ProviderController {

	@Autowired
	private ProviderService providerService;
	@PostMapping("/saveData")
	public ResponseEntity<Provider> saveProvider(@RequestBody Provider provider) {
		Provider provider2=providerService.saveProvider(provider);
		return ResponseEntity.ok().body(provider2);
		
	}
}
