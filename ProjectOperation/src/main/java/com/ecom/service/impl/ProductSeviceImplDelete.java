package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.repository.ProductRepositoryDelete;
import com.ecom.service.ProductServiceDelete;

@Service
public class ProductSeviceImplDelete implements ProductServiceDelete {


	@Autowired
	private ProductRepositoryDelete productRepositoryDelete;
	
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
	
		productRepositoryDelete.deleteById(id);
	}

	
}
