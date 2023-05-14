package com.ecom.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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

	@OneToOne(targetEntity = CartImage.class, cascade = CascadeType.ALL)
	private CartImage cartImage;

	public Cart(String title, int quantity, double price, CartImage cartImage) {
		super();
		this.title = title;
		this.quantity = quantity;
		this.price = price;
		this.cartImage = cartImage;
	}

	public CartImage getCartImage() {
		return cartImage;
	}

	public void setCartImage(CartImage cartImage) {
		this.cartImage = cartImage;
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

}
