package com.app.KisanProject.dto;

import com.app.KisanProject.entity.Fertilizer;

public class FertilizerResponse {
	private Fertilizer response;
	private String Status;
	public Fertilizer getResponse() {
		return response;
	}
	public void setResponse(Fertilizer response) {
		this.response = response;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "FertilizerResponse [response=" + response + ", Status=" + Status + "]";
	}
	

}
