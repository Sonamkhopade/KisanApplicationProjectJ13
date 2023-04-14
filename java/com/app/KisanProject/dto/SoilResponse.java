package com.app.KisanProject.dto;

import com.app.KisanProject.entity.Soil;

public class SoilResponse {
	private Soil response;
	private String status;
	public Soil getResponse() {
		return response;
	}
	public void setResponse(Soil response) {
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
		return "SoilResponse [response=" + response + ", status=" + status + "]";
	}
	

}
