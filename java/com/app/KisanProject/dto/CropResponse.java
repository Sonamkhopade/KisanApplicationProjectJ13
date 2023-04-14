package com.app.KisanProject.dto;

import com.app.KisanProject.entity.Crop;

public class CropResponse {
	private Crop response;
	private String Status;
	public Crop getResponse() {
		return response;
	}
	public void setResponse(Crop response) {
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
		return "CropResonse [response=" + response + ", Status=" + Status + "]";
	}
	

}
