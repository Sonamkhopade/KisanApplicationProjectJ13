package com.app.KisanProject.dto;

import org.springframework.stereotype.Component;

import com.app.KisanProject.entity.Admin;

@Component
public class CustomerRequest {
	private String cName;
	private String address;
	private String email;
	private int mobileNo;
	private String password;
	private Admin admin;
	
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
	@Override
	public String toString() {
		return "CustomerRequest [cName=" + cName + ", address=" + address + ", email=" + email + ", mobileNo="
				+ mobileNo + ", password=" + password + ", admin=" + admin + "]";
	}
	

}
