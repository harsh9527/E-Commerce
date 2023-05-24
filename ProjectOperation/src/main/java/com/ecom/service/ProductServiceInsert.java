package com.ecom.service;

import com.ecom.model.Product;

public interface ProductServiceInsert {
	public Product saveProduct(Product product);

	public Product getProduct(int id);
	
}
