package com.ecom.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Product;
import java.util.List;


@Repository
@EnableJpaRepositories
public interface ProductRepositoryInsert extends CrudRepository<Product, Integer> {

	public Product findById(int id);
	
}
