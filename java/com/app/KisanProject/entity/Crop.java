package com.app.KisanProject.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Crop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cropId;
	private String cropName;
	private String season;
	private String cropType;
	
	@ManyToMany(targetEntity = Soil.class,cascade = CascadeType.ALL)
	@JoinColumn(columnDefinition = "soil",referencedColumnName = "cropId")
	private List<Soil> soil;
	
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
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
		return "Crop [cropId=" + cropId + ", cropName=" + cropName + ", season=" + season + ", cropType=" + cropType
				+ ", soil=" + soil + "]";
	}
	

}
