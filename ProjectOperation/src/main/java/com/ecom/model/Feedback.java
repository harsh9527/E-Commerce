package com.ecom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int ratings;
	private String reviews;
	private String bikeNum;
	private String bikeName;
	private int userid;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	public String getBikeNum() {
		return bikeNum;
	}

	public void setBikeNum(String bikeNum) {
		this.bikeNum = bikeNum;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

}
