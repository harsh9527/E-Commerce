package com.ecom.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "provider")
public class Provider {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int pid;

	private String providerCode;

	private String providerName;

	private String people;

	private String phone;

	private String address;

	private String fax;

	private String describ;

	private LocalDateTime createDate;

	@PrePersist
	protected void onCreate() {
		createDate = LocalDateTime.now();
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPid() {
		return pid;
	}

	public String getProviderCode() {
		return providerCode;
	}

	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
public void setDescrib(String describ) {
	this.describ = describ;
}
public String getDescrib() {
	return describ;
}
	@Override
	public String toString() {
		return "Provider [pid=" + pid + ", providerCode=" + providerCode + ", providerName=" + providerName
				+ ", people=" + people + ", phone=" + phone + ", address=" + address + ", fax=" + fax + ", describ="
				+ describ + "]";
	}

}
