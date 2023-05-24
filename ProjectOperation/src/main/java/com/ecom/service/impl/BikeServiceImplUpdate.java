package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Bike;
import com.ecom.repository.BikeRepositoryUpdate;
import com.ecom.service.BikeServiceUpdate;
@Service
public class BikeServiceImplUpdate implements BikeServiceUpdate {
	@Autowired
	private BikeRepositoryUpdate bikeRepositoryUpdate;
	@Override
	public Bike update(Bike bike, int id) {
		Bike bike1=bikeRepositoryUpdate.findById(id);
		bike1.setBikename(bike.getBikename());
		bike1.setBikenum(bike.getBikenum());
		bike1.setBikename(bike.getBikevar());
		bike1.setCreatedon(bike.getCreatedon());
		bike1.setModelyear(bike.getModelyear());
		bike1.setPrice(bike.getPrice());
		bike1.setStatus(bike.getStatus());
		return bikeRepositoryUpdate.save(bike1);
		
	}

}
