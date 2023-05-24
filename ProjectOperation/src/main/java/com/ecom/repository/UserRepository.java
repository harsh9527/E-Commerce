package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.ecom.model.Reward;
import com.ecom.model.User;
import java.util.List;


@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsernameAndPassword(String username,String password);

	public Object save(Reward reward);
	
	public User findById(int id);
	
	@Query(value="select user.full_name,order_details.id,product.name from user join order_details on user.id=order_details.user_id join product_order on order_details.id=product_order.order_id join product on product_order.product_id=product.id", nativeQuery =true )
	public List<Object[]> findAllUserProducts ();
	
}
