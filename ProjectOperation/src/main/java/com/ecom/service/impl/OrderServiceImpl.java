package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Order;
import com.ecom.repository.OrderRepository;
import com.ecom.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService  {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order saveOrder(Order order) {
		
		return orderRepository.save(order);
	}

}
