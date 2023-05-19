package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Product;
import com.ecom.repository.ProductRepositoryUpdate;
import com.ecom.service.ProductServiceUpdate;

@Service
public class ProductServiceImplUpdate implements ProductServiceUpdate {

	@Autowired
	private ProductRepositoryUpdate productRepositoryUpdate;

	@Override
	public Product updateProduct(Product product) {
		return productRepositoryUpdate.save(product);
	}

}
