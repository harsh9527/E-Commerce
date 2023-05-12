package com.ecom.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Provider;
import com.ecom.repository.ProviderRepositoryFetch;
import com.ecom.service.ProviderServiceFetch;

@Service
public class ProviderServiceImplFetch implements ProviderServiceFetch {

	@Autowired
	ProviderRepositoryFetch providerRepositoryFetch;

	@Override
	public Provider getProviderById(Integer id) {
		Provider provider=providerRepositoryFetch.findByPid(id);
		return provider;
			
	}

}
