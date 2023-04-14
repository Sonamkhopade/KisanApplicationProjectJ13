package com.app.KisanProject.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.app.KisanProject.entity.Crop;
import com.app.KisanProject.entity.Fertilizer;

@Component
public class SoilRequest {
	private String sType;
	private long sCode;
	private long stateCode;
	private String districtName;
	private long districtCode;
	
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
		return "SoilRequest [sType=" + sType + ", sCode=" + sCode + ", stateCode=" + stateCode + ", districtName="
				+ districtName + ", districtCode=" + districtCode + "]";
	}
	

}
