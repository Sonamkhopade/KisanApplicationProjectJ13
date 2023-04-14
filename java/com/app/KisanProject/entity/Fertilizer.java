package com.app.KisanProject.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Fertilizer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fertilizerId;
	private String fertilizerName;
	private String fertilizerType;
	private String content;
	private double fPrize;
	
	@ManyToMany(targetEntity = Soil.class, cascade = CascadeType.ALL)
	@JoinColumn(columnDefinition = "soil", referencedColumnName = "id")
	private List<Soil> soil;
	
	@ManyToMany(targetEntity = Crop.class, cascade = CascadeType.ALL)
	@JoinColumn(columnDefinition = "crop", referencedColumnName = "id")
	private List<Crop> crop;
	
	public int getFertilizerId() {
		return fertilizerId;
	}
	public void setFertilizerId(int fertilizerId) {
		this.fertilizerId = fertilizerId;
	}
	public String getFertilizerName() {
		return fertilizerName;
	}
	public void setFertilizerName(String fertilizerName) {
		this.fertilizerName = fertilizerName;
	}
	public String getFertilizerType() {
		return fertilizerType;
	}
	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getfPrize() {
		return fPrize;
	}
	public void setfPrize(double fPrize) {
		this.fPrize = fPrize;
	}
	public List<Soil> getSoil() {
		return soil;
	}
	public void setSoil(List<Soil> soil) {
		this.soil = soil;
	}
	public List<Crop> getCrop() {
		return crop;
	}
	public void setCrop(List<Crop> crop) {
		this.crop = crop;
	}
	@Override
	public String toString() {
		return "Fertilizer [fertilizerId=" + fertilizerId + ", fertilizerName=" + fertilizerName + ", fertilizerType="
				+ fertilizerType + ", content=" + content + ", fPrize=" + fPrize + ", soil=" + soil + ", crop=" + crop
				+ "]";
	}
	

}
