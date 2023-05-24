package com.ecom.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.OrderDetails;
import com.ecom.repository.OrderDetailsRepository;
import com.ecom.service.OrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	
	@Override
	public OrderDetails saveOrderDetails(OrderDetails orderDetails) {
		// TODO Auto-generated method stub
		OrderDetails orderDetails2=orderDetailsRepository.save(orderDetails);

		return orderDetails2;
	}

	@Override
	public OrderDetails updateOrderDetails(OrderDetails orderDetails) {
		// TODO Auto-generated method stub
		return orderDetailsRepository.save(orderDetails);
	}

	@Override
	public OrderDetails getOrderDetails(int id) {
		// TODO Auto-generated method stub
		return orderDetailsRepository.findById(id);
	}

	@Override
	public void deleteById(int id) {
		orderDetailsRepository.deleteById(id);
		
	}

	@Override
	public List<OrderDetails> getAllDeatils(OrderDetails orderDetails) {
		// TODO Auto-generated method stub
		return orderDetailsRepository.findAll();
	}

	

	
}
