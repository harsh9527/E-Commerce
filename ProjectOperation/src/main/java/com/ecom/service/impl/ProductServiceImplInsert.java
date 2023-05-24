package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Product;
import com.ecom.repository.ProductRepositoryInsert;
import com.ecom.service.ProductServiceInsert;

@Service
public class ProductServiceImplInsert implements ProductServiceInsert{
	@Autowired
private ProductRepositoryInsert productRepositoryInsert;
	@Override
	public Product saveProduct(Product product) {
	return productRepositoryInsert.save(product);
		
	}
	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return productRepositoryInsert.findById(id);
	}
}
