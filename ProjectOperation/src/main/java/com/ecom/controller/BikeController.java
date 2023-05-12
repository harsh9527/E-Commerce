package com.ecom.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Bike;
import com.ecom.service.BikeService;


@RestController
public class BikeController {

	@Autowired
	private BikeService bikeService;
	
	@GetMapping("/getAllBike")
	public List<Bike> getBikes()
	{
		return bikeService.getbikeList();
	}
	
	@PostMapping("/save")
	public ResponseEntity<Bike> saveBike(@RequestBody Bike bike)
	{
		Bike bike2=bikeService.savBike(bike);
		return ResponseEntity.ok().body(bike2);
	}
}
