package com.ecom.service;

import java.util.List;

import com.ecom.model.Product;

public interface ProductServiceInsert {
	public Product saveProduct(Product product);
	public List<Product> saveAll(List<Product> list);

}
