package com.app.KisanProject.dto;

import com.app.KisanProject.entity.Market;

public class MarketResponse {
	private Market response;
	private String status;
	public Market getResponse() {
		return response;
	}
	public void setResponse(Market response) {
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
		return "MarketResponse [response=" + response + ", status=" + status + "]";
	}
	

}
