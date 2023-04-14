package com.app.KisanProject.dto;

import com.app.KisanProject.entity.Customer;

public class CustomerResponse {
	private Customer response;
	private String status;
	public Customer getResponse() {
		return response;
	}
	public void setResponse(Customer response) {
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
		return "CustomerResponse [response=" + response + ", status=" + status + "]";
	}
	

}
