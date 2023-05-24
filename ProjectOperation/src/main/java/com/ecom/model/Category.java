package com.ecom.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String categoryName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<Bike> getBikeSet() {
		return bikeSet;
	}

	public void setBikeSet(Set<Bike> bikeSet) {
		this.bikeSet = bikeSet;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "category_product",joinColumns 
	=@JoinColumn(name="category_id_id",referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="bike_id",referencedColumnName = "id"))
	private Set<Bike> bikeSet;
	
	

}
