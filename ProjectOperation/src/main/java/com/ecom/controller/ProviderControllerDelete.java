package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.service.ProviderServiceDelete;

@RestController
public class ProviderControllerDelete {

	@Autowired
	private ProviderServiceDelete providerServiceDelete;
	
	@DeleteMapping("/delete/{pid}")
	public void deleteProviderById(@PathVariable("pid")Integer pid) {
		
		providerServiceDelete.deleteById(pid);
	}
	
}
