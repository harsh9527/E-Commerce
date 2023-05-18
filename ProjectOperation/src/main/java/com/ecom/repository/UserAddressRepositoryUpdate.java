package com.ecom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.UserAddress;
@Repository
public interface UserAddressRepositoryUpdate extends CrudRepository<UserAddress, Integer> {

}
