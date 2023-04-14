package com.app.KisanProject.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.app.KisanProject.entity.Crop;
import com.app.KisanProject.entity.Soil;

@Component
public class FertilizerRequest {
	private String fertilizerName;
	private String fertilizerType;
	private String content;
	private double fPrize;
	private List<Soil> soil;
	private List<Crop> crop;
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
		return "FertilizerRequest [fertilizerName=" + fertilizerName + ", fertilizerType=" + fertilizerType
				+ ", content=" + content + ", fPrize=" + fPrize + ", soil=" + soil + ", crop=" + crop + "]";
	}
	

}
