package com.ecom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Bike;
import com.ecom.repository.BikeRepository;
import com.ecom.service.BikeService;

@Service
public class BikeServiceImpl implements BikeService {

	@Autowired
	private BikeRepository bikeRepository;
	
	
	@Override
	public List<Bike> getbikeList() {
		// TODO Auto-generated method stub
		return bikeRepository.findAll();
	}


	@Override
	public Bike savBike(Bike bike) {
		// TODO Auto-generated method stub
		return bikeRepository.save(bike);
	}

}
