package com.app.KisanProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Commodity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long commodityId;
	private String cName;
	private String grades;
	private double price;
	public long getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(long commodityId) {
		this.commodityId = commodityId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Commodity [commodityId=" + commodityId + ", cName=" + cName + ", grades=" + grades + ", price=" + price
				+ "]";
	}
	

}
