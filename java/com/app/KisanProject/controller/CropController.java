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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.KisanProject.dto.CropRequest;
import com.app.KisanProject.dto.CropResponse;
import com.app.KisanProject.entity.Crop;
import com.app.KisanProject.service.CropService;

@RestController
public class CropController {
	@Autowired
	private CropService cropService;
	Logger logger=LoggerFactory.getLogger(CropController.class);
	
	@RequestMapping(value="/addCrop",method = RequestMethod.POST,
			consumes="application/json",produces="application/json")
	public ResponseEntity<CropResponse> addCrop(@RequestBody CropRequest request){
		logger.info("CropController class start addCrop() method request is..."+request);
		CropResponse response=cropService.addCrop(request);
		logger.info("Cropcontroller class end addCrop() method response is..."+response);
		return new ResponseEntity<CropResponse> (response,HttpStatus.OK);
	}
	
	@GetMapping(value="/listCrop",produces="application/json")
	public ResponseEntity<List<Crop>> listCrop(){
		List<Crop> response=cropService.listCrop();
		logger.info("CropController class listCrop() method is..."+response);
		return new ResponseEntity<List<Crop>>(response,HttpStatus.OK);
	}
	
	@GetMapping(value="/getCrop",produces="application/json")
	public ResponseEntity<Crop> getCropById(@RequestParam int cropId){
		Crop response=cropService.getCropById(cropId);
		logger.info("CropController class getCropById() method is..."+response);
		return new ResponseEntity<Crop>(response,HttpStatus.OK);
	}
	
	@PutMapping(value="/updateCrop",consumes="application/json", produces="application/json")
	public ResponseEntity<Crop> updateCrop(@RequestParam int cropId,@RequestBody CropRequest request){
		logger.info("CropController class start updateCrop() method request is..."+request);
		Crop response=cropService.updateCrop(cropId, request);
		logger.info("CropController class end updateCrop() method response is..."+response);
		return new ResponseEntity<Crop>(response,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deleteCrop")
	public ResponseEntity<String> deleteCrop(@RequestParam int cropId){
		cropService.deleteCrop(cropId);
		return new ResponseEntity<String>("Crop Deleted Successfully...",HttpStatus.OK);
	}

}
