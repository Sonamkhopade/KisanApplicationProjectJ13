package com.app.KisanProject.dto;

import com.app.KisanProject.entity.Commodity;

public class CommodityResponse {
	private Commodity response;
	private String status;
	public Commodity getResponse() {
		return response;
	}
	public void setResponse(Commodity response) {
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
		return "CommodityResponse [response=" + response + ", status=" + status + "]";
	}
	

}
