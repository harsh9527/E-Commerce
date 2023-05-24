package com.ecom.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//80.Design the Restful web services to add the order details into database

@Entity
@Table(name = "orderDetails")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "user_id")
	private int userId;
	private String productName;
	private int quantity;
	private double price;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "product_order",joinColumns 
	=@JoinColumn(name="order_id",referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="product_id",referencedColumnName = "id"))
	private Set<Product> products; 

	

	
	@ManyToOne
	@JoinColumn(name = "user_id",insertable = false,updatable = false)
	private User user;
	
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
