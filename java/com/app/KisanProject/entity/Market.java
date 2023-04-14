package com.app.KisanProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Market {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long marketId;
	private String marketName;
	private double price;
	private String arrival;
	private String garade;
	public long getMarketId() {
		return marketId;
	}
	public void setMarketId(long marketId) {
		this.marketId = marketId;
	}
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
		return "Market [marketId=" + marketId + ", marketName=" + marketName + ", price=" + price + ", arrival="
				+ arrival + ", garade=" + garade + "]";
	}
	

}
