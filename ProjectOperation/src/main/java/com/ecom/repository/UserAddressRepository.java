package com.ecom.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecom.model.UserAddress;


@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, Integer> {

}
