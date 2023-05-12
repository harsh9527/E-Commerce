package com.ecom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Provider;



@Repository
public interface ProviderRepositoryFetch extends CrudRepository<Provider,Integer> {
	
public Provider findByPid(Integer pid);
}
