package com.app.KisanProject.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cId;
	private String cName;
	private String address;
	private String email;
	private int mobileNo;
	private String password;
	
	@ManyToOne(targetEntity = Admin.class, cascade = CascadeType.ALL)
	@JoinColumn(columnDefinition="soil", referencedColumnName = "id")
	Admin admin;
	
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	public Customer(long cId, String cName, String address, String email, int mobileNo, String password, Admin admin) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.address = address;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = password;
		this.admin = admin;
	}
	public Customer(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", address=" + address + ", email=" + email + ", mobileNo="
				+ mobileNo + ", password=" + password + ", admin=" + admin + "]";
	}
	

}
