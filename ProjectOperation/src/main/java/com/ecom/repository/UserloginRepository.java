package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.ecom.model.User;
import com.ecom.model.UserLogin;

@Repository
@EnableJpaRepositories
public interface UserloginRepository extends JpaRepository<UserLogin, Integer> {

	public UserLogin findByUsernameAndPassword(String username,String password);
	
	
}
