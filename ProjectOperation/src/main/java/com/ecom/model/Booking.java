package com.ecom.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bikename;
	private String bikenum;
	private String fromdate;
	private String todate;
	private String uname;
	private String phone;
	private String gender;
	private int advanceamount;

	@OneToOne(targetEntity = Payment.class,cascade = CascadeType.ALL)
	private Payment payment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBikename() {
		return bikename;
	}

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}

	public String getBikenum() {
		return bikenum;
	}

	public void setBikenum(String bikenum) {
		this.bikenum = bikenum;
	}

	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAdvanceamount() {
		return advanceamount;
	}

	public void setAdvanceamount(int advanceamount) {
		this.advanceamount = advanceamount;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
