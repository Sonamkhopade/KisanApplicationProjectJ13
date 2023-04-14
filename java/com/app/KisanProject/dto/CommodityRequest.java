package com.app.KisanProject.dto;

import org.springframework.stereotype.Component;

@Component
public class CommodityRequest {
	private String cName;
	private String grades;
	private double price;
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
		return "CommodityRequest [cName=" + cName + ", grades=" + grades + ", price=" + price + "]";
	}
	

}
