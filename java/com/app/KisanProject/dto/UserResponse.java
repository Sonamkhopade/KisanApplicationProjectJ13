package com.app.KisanProject.dto;

import com.app.KisanProject.entity.UserRegistration;

public class UserResponse {
	private UserRegistration response;
	private String status;
	
	public UserRegistration getResponse() {
		return response;
	}

	public void setResponse(UserRegistration response) {
		this.response = response;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Response [response=" + response + ", status=" + status + "]";
	}
	
	public UserResponse(UserRegistration response, String status) {
		super();
		this.response = response;
		this.status = status;
	}
	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
