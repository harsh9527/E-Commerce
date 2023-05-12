package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer>{

	
}
