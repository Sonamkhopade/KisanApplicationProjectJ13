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
public class Soil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sId;
	private String sType;
	private long sCode;
	private long stateCode;
	private String districtName;
	private long districtCode;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsType() {
		return sType;
	}
	public void setsType(String sType) {
		this.sType = sType;
	}
	public long getsCode() {
		return sCode;
	}
	public void setsCode(long sCode) {
		this.sCode = sCode;
	}
	public long getStateCode() {
		return stateCode;
	}
	public void setStateCode(long stateCode) {
		this.stateCode = stateCode;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public long getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(long districtCode) {
		this.districtCode = districtCode;
	}
	
	@Override
	public String toString() {
		return "Soil [sId=" + sId + ", sType=" + sType + ", sCode=" + sCode + ", stateCode=" + stateCode
				+ ", districtName=" + districtName + ", districtCode=" + districtCode + "]";
	}
	

}
