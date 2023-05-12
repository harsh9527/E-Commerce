package com.ecom.service.impl;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.repository.ProviderRepositoryDelete;
import com.ecom.service.ProviderServiceDelete;

@Service
public class ProviderServiceImplDelete implements ProviderServiceDelete {

	
	@Autowired
	private ProviderRepositoryDelete providerRepositoryDelete; 
	@Override
	public void deleteById(Integer pid) {
		// TODO Auto-generated method stub
	
		providerRepositoryDelete.deleteById(pid);
	}

}
