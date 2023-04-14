package com.app.KisanProject.dto;

import org.springframework.stereotype.Component;

import com.app.KisanProject.entity.Admin;

@Component
public class UserRequest {
	private String name;
	private String address;
	private long mobileNo;
	private String email;
	private String password;
	private Admin admin;
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
	@Override
	public String toString() {
		return "UserRequest [name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", password=" + password + ", admin=" + admin + "]";
	} 

}
