package com.ecom.service;


import java.util.List;

import com.ecom.model.OrderDetails;

public interface OrderDetailsService {

	// 80.Design the Restful web services to add the order details into database By
	// Nileishdl

	public OrderDetails saveOrderDetails(OrderDetails orderDetails);

	// 81.Design the Restful web services to update the order details into database
	// By Nileishdl
    public OrderDetails updateOrderDetails(OrderDetails orderDetails);

    
    
	// 82.Design the Restful web services to get the order details into database By
	// Nileishdl
	public OrderDetails getOrderDetails(int id);


	
	// 83.Design the Restful web services to delete the order details into database
	// By Nileishdl
	public void deleteById(int id);
	
	public List<OrderDetails> getAllDeatils(OrderDetails orderDetails);

}
