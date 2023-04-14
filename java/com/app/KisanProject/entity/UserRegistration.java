package com.app.KisanProject.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UserRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String address;
	private long mobileNo;
	private String email;
	private String password;
	
	@ManyToOne(targetEntity = Admin.class, cascade = CascadeType.ALL)
	@JoinColumn(columnDefinition="soil", referencedColumnName = "id")
	Admin admin;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	public UserRegistration(long id, String name, String address, long mobileNo, String email, String password,
			Admin admin) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
		this.admin = admin;
	}
	public UserRegistration(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserRegistration [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", email=" + email + ", password=" + password + ", admin=" + admin + "]";
	}
}
