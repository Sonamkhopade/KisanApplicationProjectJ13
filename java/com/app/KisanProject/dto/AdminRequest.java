package com.app.KisanProject.dto;

import org.springframework.stereotype.Component;

@Component
public class AdminRequest {
	private String aName;
	private String email;
	private String password;
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
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
	@Override
	public String toString() {
		return "AdminRequest [aName=" + aName + ", email=" + email + ", password=" + password + "]";
	}

}
