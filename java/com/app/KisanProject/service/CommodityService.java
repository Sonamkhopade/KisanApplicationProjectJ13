package com.app.KisanProject.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.KisanProject.dto.CommodityRequest;
import com.app.KisanProject.dto.CommodityResponse;
import com.app.KisanProject.entity.Commodity;
import com.app.KisanProject.repository.CommodityRepository;

@Service
public class CommodityService {
	@Autowired
	private CommodityRepository commodityRepo;
	Logger logger=LoggerFactory.getLogger(CommodityService.class);
	CommodityResponse response=new CommodityResponse();

	public CommodityResponse addCommodity(CommodityRequest request) {
		// TODO Auto-generated method stub
		logger.info("CommodityService class start addCommodity() method request is"+request);
		Commodity commodity=CreateCommodityObject(request);
		Commodity c= commodityRepo.save(commodity);
		if(c!=null) {
			response.setResponse(c);
			response.setStatus("Commodity added in database..");
		}
		else {
			response.setResponse(c);
			response.setStatus("Failed to add in database...");
		}
		logger.info("CommodityService class end addCommodity method response is..."+response);
		return response;
	}

	private Commodity CreateCommodityObject(CommodityRequest request) {
		// TODO Auto-generated method stub
		Commodity commodity=new Commodity();
		commodity.setcName(request.getcName());
		commodity.setGrades(request.getGrades());
		commodity.setPrice(request.getPrice());
		return commodity;
	}

	public Commodity getCommodityInfo(long commodityId) {
		// TODO Auto-generated method stub
		return commodityRepo.findById(commodityId).get();
	}

	public List<Commodity> commodityList() {
		// TODO Auto-generated method stub
		return commodityRepo.findAll();
	}

	public Commodity updateCommodity(long commodityId, CommodityRequest request) {
		// TODO Auto-generated method stub
		logger.info("CommodityService class start UpdateController() method request is..."+request);
		Commodity c=commodityRepo.findById(commodityId).get();
		Commodity c1=null;
		if(c!=null) {
			c.setcName(request.getcName());
			c.setGrades(request.getGrades());
			c.setPrice(request.getPrice());
			commodityRepo.save(c);
		}
		logger.info("CommodityService class end updateController() method request is..."+response);
			return c1;
	}

	public void deleteCommodity(long commodityId) {
		// TODO Auto-generated method stub
		commodityRepo.deleteById(commodityId);
	}

}
