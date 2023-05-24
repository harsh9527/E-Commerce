package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.OrderDetails;
import com.ecom.service.OrderDetailsService;

@RestController
public class OrderDetailsController {

	@Autowired
	private OrderDetailsService orderDetailsService;

	@RequestMapping(value = "/saveOrderProduct",method = RequestMethod.POST)
	@ResponseBody
	public OrderDetails saveOrderDetails(@RequestBody OrderDetails orderDetails) {

		OrderDetails orderDetails2 = orderDetailsService.saveOrderDetails(orderDetails);

		return orderDetails2;

	}

	@PutMapping("/updateOrderDetails")
	public ResponseEntity<OrderDetails> updateOrderDetails(@RequestBody OrderDetails orderDetails){
		
		
		OrderDetails orderDetails4 =orderDetailsService.updateOrderDetails(orderDetails);
		
		return ResponseEntity.ok().body(orderDetails4);
		
		
		
	}
	
	@GetMapping("/getOrderDetails/{id}")
	public OrderDetails getOrderDetails(@PathVariable("id") int id) {
	
		OrderDetails orderDetails3 = orderDetailsService.getOrderDetails(id);
		
		return orderDetails3;
		
		
	}
	
	@DeleteMapping("/deleteOrderDetails/{id}")
    public void deleteOrderDetails(@PathVariable("id") int id) {
		
		orderDetailsService.deleteById(id);
	}



}
