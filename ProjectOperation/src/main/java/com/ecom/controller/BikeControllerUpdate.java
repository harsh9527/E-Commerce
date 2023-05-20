package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Bike;
import com.ecom.service.BikeServiceUpdate;

@RestController
public class BikeControllerUpdate {
	@Autowired
	private BikeServiceUpdate bikeServiceUpdate;
	
	@PutMapping("/upateBike/{id}")
	public Bike updateBike(@RequestBody Bike bike,@PathVariable int id) {
		Bike bike1=bikeServiceUpdate.update(bike, id);
		return bike1;
		
	}
	

}
