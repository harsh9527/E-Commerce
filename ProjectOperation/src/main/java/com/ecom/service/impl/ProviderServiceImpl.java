package com.ecom.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Provider;
import com.ecom.repository.ProviderRepository;
import com.ecom.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	private ProviderRepository providerRepository;
	
	@Override
	public Provider saveProvider(Provider provider) {
		Provider provider1= providerRepository.save(provider);
		return provider1;
	}

}
