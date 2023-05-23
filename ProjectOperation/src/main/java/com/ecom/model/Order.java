package com.ecom.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="orderproducts")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	
	private int userId;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="order_products", joinColumns = @JoinColumn (name="oid",referencedColumnName = "oid"),inverseJoinColumns =@JoinColumn(name="product_id",referencedColumnName = "pid")) 
	private List<Product> productList;

	public int getOrderId() {
		return oid;
	}

	public void setOrderId(int orderId) {
		this.oid = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	

}
