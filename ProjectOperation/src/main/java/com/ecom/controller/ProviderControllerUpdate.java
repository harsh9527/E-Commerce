package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Provider;
import com.ecom.service.ProviderServiceUpdate;

@RestController
public class ProviderControllerUpdate {
	@Autowired
	private ProviderServiceUpdate providerServiceUpdate;
	
	@PutMapping("/updateData")
	public ResponseEntity<Provider> saveProvider(@RequestBody Provider provider) {
		Provider provider2=providerServiceUpdate.updateProvider(provider);
		return ResponseEntity.ok().body(provider2);
		

}
}