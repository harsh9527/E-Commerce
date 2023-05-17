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


	@Override
	public Bike updateBike(Bike bike, int id) {
		Bike bike2=bikeRepository.findById(id).get();
		bike2.setBikenum(bike.getBikenum());
		bike2.setBikename(bike.getBikename());
		bike2.setBikevar(bike.getBikevar());
		bike2.setModelyear(bike.getModelyear());
		bike2.setStatus(bike.getStatus());
		bike2.setCreatedon(bike.getCreatedon());
		bike2.setPrice(bike.getPrice());
		
		return bikeRepository.save(bike2);
	}


	@Override
	public void deleteBike(int id) {
		bikeRepository.deleteById(id);
	}

}
