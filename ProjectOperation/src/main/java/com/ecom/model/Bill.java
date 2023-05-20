package com.ecom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bid;
	private String billCode;
	private String billName;
	private String billCom;
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public String getBillCom() {
		return billCom;
	}
	public void setBillCom(String billCom) {
		this.billCom = billCom;
	}
	public Integer getBillNum() {
		return billNum;
	}
	public void setBillNum(Integer billNum) {
		this.billNum = billNum;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	private Integer billNum;
	private Double money;
	private Integer pid;

	

	

}
