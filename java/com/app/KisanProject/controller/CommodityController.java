package com.app.KisanProject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.KisanProject.dto.CommodityRequest;
import com.app.KisanProject.dto.CommodityResponse;
import com.app.KisanProject.entity.Commodity;
import com.app.KisanProject.service.CommodityService;

@RestController
public class CommodityController {
	@Autowired
	private CommodityService commodityService;
	Logger logger=LoggerFactory.getLogger(CommodityController.class);
	
	@RequestMapping(value="/addCommodity",method=RequestMethod.POST,
			consumes="application/json",produces="application/json")
	public ResponseEntity<CommodityResponse> addCommodity(@RequestBody CommodityRequest request){
		logger.info("CommodityController class start addCommodity() method request is..."+request);
		CommodityResponse response=commodityService.addCommodity(request);
		logger.info("CommodityController class end addCommodity() method response is..."+response);
		return new ResponseEntity<CommodityResponse>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="getCommodityInfo", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Commodity> getCommodityInfo(@RequestParam long commodityId){
		Commodity response=commodityService.getCommodityInfo(commodityId);
		logger.info("CommodityController class getCommodityInfo() method response is..."+response);
		return new ResponseEntity<Commodity>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/commodityList", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<Commodity>> commodityList(){
		List<Commodity> response=commodityService.commodityList();
		logger.info("CommodityController class commodityList() method response is..."+response);
		return new ResponseEntity<List<Commodity>>(response,HttpStatus.OK);
	}
	
	@PutMapping(value="/updateCommodity",consumes="application/json",produces="application/json")
	public ResponseEntity<Commodity> updateCommodity(@RequestParam long commodityId,
			@RequestBody CommodityRequest request){
		logger.info("CommodityController class start updateCommodity() method request is..."+request);
		Commodity response=commodityService.updateCommodity(commodityId, request);
		logger.info("CommodityCommodity class start updateCommodity() method response is..."+response);
		return new ResponseEntity<Commodity>(response,HttpStatus.OK);
	}
	@DeleteMapping(value="/deleteCommodity")
	public ResponseEntity<String> deleteCommodityInfo(@RequestParam long commodityId){
		commodityService.deleteCommodity(commodityId);
		logger.info("CommodityController class deleteCommodity() method is...");
		return new ResponseEntity<String>("delete successfully...",HttpStatus.OK);
	}

	

}
