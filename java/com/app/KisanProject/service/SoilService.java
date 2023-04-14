package com.app.KisanProject.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.KisanProject.dto.SoilRequest;
import com.app.KisanProject.dto.SoilResponse;
import com.app.KisanProject.entity.Soil;
import com.app.KisanProject.repository.SoilRepository;

@Service
public class SoilService {
	@Autowired
	private SoilRepository repo;
	Logger logger=LoggerFactory.getLogger(SoilService.class);
	SoilResponse response=new SoilResponse();

	public SoilResponse addSoil(SoilRequest request) {
		// TODO Auto-generated method stub
		logger.info("SoilService class start addSoil() method request is..."+request);
		Soil soil=CreateSoilObject(request);
		Soil s=repo.save(soil);
		if(s!=null) {
			response.setResponse(s);
			response.setStatus("Soil added in database....");
		}
		else {
			response.setResponse(s);
			response.setStatus("failed to add soil in database....!");
		}
		return response;
	}

	private Soil CreateSoilObject(SoilRequest request) {
		// TODO Auto-generated method stub
		Soil soil=new Soil();
		soil.setsType(request.getsType());
		soil.setDistrictCode(request.getDistrictCode());
		soil.setDistrictName(request.getDistrictName());
		soil.setStateCode(request.getStateCode());
		soil.setsCode(request.getsCode());
		return soil;
	}

	public void deleteSoil(int sId) {
		// TODO Auto-generated method stub
		repo.deleteById(sId);;
	}

	public Soil updateSoil(int sId, SoilRequest request) {
		// TODO Auto-generated method stub
		logger.info("SoilService class start updateSoil() method request is...."+request);
		Soil s=repo.findById(sId).get();
		Soil s1=null;
		if(s!=null) {
			s.setsType(request.getsType());
			s.setDistrictCode(request.getDistrictCode());
			s.setDistrictName(request.getDistrictName());
			s.setsCode(request.getsCode());
			s.setStateCode(request.getStateCode());
			repo.save(s);
			System.out.println("Success...");
		}
		logger.info("SoilService class end updateSoil() method response is..."+response);
		return s1;
	}

	public List<Soil> getSoil() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
