package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.service.ProductServiceDelete;

//49.Design the API to cancel the product based on id //By Nilesh D. Limbalkar
@RestController
public class ProductControllerDelete {

	@Autowired
	private ProductServiceDelete productServiceDelete;
	
	
	@DeleteMapping("/deleteProduct/{id}")
public void deleteProductById(@PathVariable("id")Integer id) {
		
		productServiceDelete.deleteById(id);
	}
	
}
