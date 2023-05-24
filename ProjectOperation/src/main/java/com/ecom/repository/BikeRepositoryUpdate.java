package com.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Bike;

@Repository
public interface BikeRepositoryUpdate extends JpaRepository<Bike, Integer> {

	
	public Bike findById(int id);
	
	public List<Bike> findAll();
	
}
