package com.ecom.model;

import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cartId;
	private String title;
	private int quantity;
	private double price;
	private String name;
	private String type;
	
	@Lob
	private byte[] image;

	
	 public Cart() {
	        // Default constructor added due to error occurred and asking for default constructor
	    }
	
	
	public Cart( String title, int quantity, double price, String name, String type, byte[] image) {
		
	
		this.title = title;
		this.quantity = quantity;
		this.price = price;
		this.name = name;
		this.type = type;
		this.image = image;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	//@OneToOne(targetEntity = CartImage.class, cascade = CascadeType.ALL)
	//private CartImage cartImage;

	@OneToMany(targetEntity = Bike.class,cascade = CascadeType.ALL)
	private List<Bike> bikeList;


	public List<Bike> getBikeList() {
		return bikeList;
	}


	public void setBikeList(List<Bike> bikeList) {
		this.bikeList = bikeList;
	}
}
