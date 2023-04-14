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

import com.app.KisanProject.dto.FertilizerRequest;
import com.app.KisanProject.dto.FertilizerResponse;
import com.app.KisanProject.entity.Fertilizer;
import com.app.KisanProject.service.FertilizerService;

@RestController
public class FertilizerController {
	@Autowired
	private FertilizerService fertilizerService;
	Logger logger=LoggerFactory.getLogger(FertilizerController.class);
	
	@PostMapping(value="/addFertilizer",consumes="application/json",produces="application/json")
	public ResponseEntity<FertilizerResponse> addFertilizer(@RequestBody FertilizerRequest request){
		logger.info("Fertilizercontroller class start addFertilizer() method request is..."+request);
		FertilizerResponse response=fertilizerService.addFertilizer(request);
		logger.info("Fertilizercontroller class end addFertilizer() method response is..."+response);
		return new ResponseEntity<FertilizerResponse>(response,HttpStatus.OK);
	}
	
	@GetMapping(value="/getFertilizer",produces="application/json")
	public ResponseEntity<Fertilizer> getFertilizer(@RequestParam int fertilizerId){
		logger.info("Fertilizercontroller class start getFertilizer() method request is...");
		Fertilizer fertilizer=fertilizerService.getFertilizer(fertilizerId);
		logger.info("Fertilizercontroller class end getFertilizer() method response is..."+fertilizer);
		return new ResponseEntity<Fertilizer>(fertilizer,HttpStatus.OK);
	}
	
	@GetMapping(value="/listFertilizer",produces="application/json")
	public ResponseEntity<List<Fertilizer>> listFertilizer(){
		logger.info("Fertilizercontroller class start listFertilizer() method request is...");
		List<Fertilizer>fertilizer=fertilizerService.listFertilizer();
		logger.info("Fertilizercontroller class end listFertilizer() method response is..."+fertilizer);
		return new ResponseEntity<List<Fertilizer>>(fertilizer,HttpStatus.OK);
	}
	
	@PutMapping(value="/updateFertilizer",consumes="application/json",produces="application/json")
	public ResponseEntity<Fertilizer> updateFertilizer(@RequestParam int fertilizerId,
			@RequestBody FertilizerRequest request){
		logger.info("Fertilizercontroller class start updateFertilizer() method request is..."+request);
		Fertilizer fertilizer=fertilizerService.updateFertilizer(fertilizerId, request);
		logger.info("Fertilizercontroller class end updateFertilizer() method response is..."+fertilizer);
		return new ResponseEntity<Fertilizer>(fertilizer,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deleteFertilizer")
	public ResponseEntity<String> deleteFertilizer(@RequestParam int fertilizerId){
		fertilizerService.deleteFertilizer(fertilizerId);
		return new ResponseEntity<String>("fertilizer Deleted...",HttpStatus.OK);
	}

}
