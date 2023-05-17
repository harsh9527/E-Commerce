package com.ecom.service;

import java.util.List;

import com.ecom.model.Bike;

public interface BikeService {
	
	public List<Bike> getbikeList();
	
	public Bike savBike(Bike bike);
	
	public Bike updateBike(Bike bike,int id);
	
	public void deleteBike(int id);
	

}
