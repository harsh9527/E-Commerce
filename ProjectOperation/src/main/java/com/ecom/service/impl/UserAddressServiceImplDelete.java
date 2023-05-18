package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.repository.UserAddressRepositoryDelete;
import com.ecom.service.UserAddressServiceDelete;
@Service
public class UserAddressServiceImplDelete implements UserAddressServiceDelete {

	@Autowired
	private UserAddressRepositoryDelete repoDelete;
	@Override
	public void deleteById(Integer id) {
		repoDelete.deleteById(id);
		
	}

}
