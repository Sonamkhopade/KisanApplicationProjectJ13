package com.app.KisanProject.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.app.KisanProject.entity.Fertilizer;
import com.app.KisanProject.entity.Soil;

@Component
public class CropRequest {
	private String cropName;
	private String season;
	private String cropType;
	private List<Soil> soil;
	
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	
	public List<Soil> getSoil() {
		return soil;
	}
	public void setSoil(List<Soil> soil) {
		this.soil = soil;
	}
	@Override
	public String toString() {
		return "CropRequest [cropName=" + cropName + ", season=" + season + ", cropType=" + cropType + ", soil=" + soil
				+ "]";
	}
	

}
