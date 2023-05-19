package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Product;
@Repository
public interface ProductRepositoryUpdate extends JpaRepository<Product,Integer> {

}
