package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Provider;
@Repository
public interface ProviderRepositoryUpdate extends JpaRepository<Provider, Integer> {

}
