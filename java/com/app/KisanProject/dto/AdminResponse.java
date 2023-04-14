package com.app.KisanProject.dto;

import com.app.KisanProject.entity.Admin;

public class AdminResponse {
	private Admin response;
	private String status;
	public Admin getResponse() {
		return response;
	}
	public void setResponse(Admin response) {
		this.response = response;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public AdminResponse(Admin response, String status) {
		super();
		this.response = response;
		this.status = status;
	}
	public AdminResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminResponse [response=" + response + ", status=" + status + "]";
	}
	

}
