package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Provider;
import com.ecom.repository.ProviderRepositoryUpdate;
import com.ecom.service.ProviderServiceUpdate;
@Service
public class ProviderServiceImplUpdate implements ProviderServiceUpdate {
	@Autowired
private ProviderRepositoryUpdate providerRepositoryUpdate;

@Override
public Provider updateProvider(Provider provider) {

	return providerRepositoryUpdate.save(provider);
}
	}


