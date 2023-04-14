package com.app.KisanProject.dto;

import org.springframework.stereotype.Component;

@Component
public class MarketRequest {
	private String marketName;
	private double price;
	private String arrival;
	private String garade;
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getGarade() {
		return garade;
	}
	public void setGarade(String garade) {
		this.garade = garade;
	}
	@Override
	public String toString() {
		return "MarketRequest [marketName=" + marketName + ", price=" + price + ", arrival=" + arrival + ", garade="
				+ garade + "]";
	}
	

}
