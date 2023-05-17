package com.ecom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.User;

@Repository
public interface UserRepositoryInsert extends CrudRepository<User, Integer>{
	

}
