package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Reward;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Integer> {

} 
