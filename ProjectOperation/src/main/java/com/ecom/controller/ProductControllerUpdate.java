package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Product;
import com.ecom.service.ProductServiceUpdate;

@RestController
public class ProductControllerUpdate {

	@Autowired
	private ProductServiceUpdate productServiceUpdate;

	//Design the API to update the product details into database

	@PutMapping("/productUpdate/{id}")
	public Product updateProduct(@PathVariable int id,@RequestBody Product product) {

		product.setId(id);
		return productServiceUpdate.updateProduct(product);

	}
}
