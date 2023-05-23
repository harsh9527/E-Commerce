package com.ecom.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pid;
private String name;
private String type;
private String description;
private int quantity;
private int price;

@ManyToMany(mappedBy = "productList")
private List<Order> orders;




public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public List<Order> getOrders() {
	return orders;
}

public void setOrders(List<Order> orders) {
	this.orders = orders;
}

public Product() {
	
	}

public int getId() {
	return pid;
}
public void setId(int id) {
	this.pid = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Product [id=" + pid + ", name=" + name + ", type=" + type + ", description=" + description + "]";
}
public Product(int id, String name, String type, String description) {
	super();
	this.pid = id;
	this.name = name;
	this.type = type;
	this.description = description;
}


}
