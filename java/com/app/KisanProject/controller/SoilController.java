package com.app.KisanProject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.KisanProject.dto.SoilRequest;
import com.app.KisanProject.dto.SoilResponse;
import com.app.KisanProject.entity.Soil;
import com.app.KisanProject.service.SoilService;

@RestController
public class SoilController {
	@Autowired
	private SoilService soilService;
	Logger logger=LoggerFactory.getLogger(SoilController.class);
	
	@PostMapping(value="/addSoil",consumes="application/json",produces="application/json")
	public ResponseEntity<SoilResponse> addSoil(@RequestBody SoilRequest request){
		logger.info("SoilController class start addSoil() method request is..."+request);
		SoilResponse response=soilService.addSoil(request);
		logger.info("SoilController class end addSoil() method response is..."+response);
		return new ResponseEntity<SoilResponse>(response,HttpStatus.OK);
	}
	
	@PutMapping(value="/updateSoil",consumes="application/json",produces="application/json")
	public ResponseEntity<Soil> updateSoil(@RequestParam int sId,@RequestBody SoilRequest request ){
		logger.info("SoilController class start updateSoil() method request is..."+request);
		Soil soil=soilService.updateSoil(sId,request);
		logger.info("SoilController class end updateSoil() method response is..."+soil);
		return new ResponseEntity<Soil>(soil,HttpStatus.OK);
	}
	
	@GetMapping(value="/listSoil",produces="application/json")
	public ResponseEntity<List<Soil>> getSoil(){
		logger.info("SoilCotroller class start listSoil() method Request....");
		List<Soil> soil=soilService.getSoil();
		return new ResponseEntity<List<Soil>>(soil,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deleteSoil")
	public ResponseEntity<String> deleteSoil(@RequestParam int sId){
		soilService.deleteSoil(sId);
		return new ResponseEntity<String>("Soil delete sucessfully",HttpStatus.OK);
	}

}
