package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Product;
import com.ecom.service.ProductServiceInsert;

@RestController
public class ProductControllerInsert {
	@Autowired
	private ProductServiceInsert productServiceInsert;
	
	@RequestMapping(value = "/saveProductOrder",method = RequestMethod.POST)
	@ResponseBody
	public Product saveProduct(@RequestBody Product product) {
		Product product2=productServiceInsert.saveProduct(product);
		return product2;
	}

}
