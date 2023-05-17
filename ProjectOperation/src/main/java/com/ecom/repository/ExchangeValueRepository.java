package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecom.model.ExchangeValue;
@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer> {
	@Query(value="select * from exchangevalue e where _from=?1 and _to=?2",nativeQuery = true)
	public ExchangeValue getExchangeValueFt(String f,String t);
}
