package com.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.ecom.model.Category;

@Repository
@EnableJpaRepositories
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	public Category findById(int id);
	
	public List<Category> findAll();
	
}
