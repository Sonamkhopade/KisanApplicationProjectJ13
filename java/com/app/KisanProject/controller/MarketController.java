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

import com.app.KisanProject.dto.MarketRequest;
import com.app.KisanProject.dto.MarketResponse;
import com.app.KisanProject.entity.Market;
import com.app.KisanProject.service.MarketService;

@RestController
public class MarketController {
	@Autowired
	private MarketService marketService;
	Logger logger=LoggerFactory.getLogger(MarketController.class);
	
	@PostMapping(value="/addMarket",consumes="application/json",produces="application/json")
	public ResponseEntity<MarketResponse> addMarket(@RequestBody MarketRequest request){
		logger.info("MarketController class start addMerket() method request is..."+request);
		MarketResponse response=marketService.addMarket(request);
		logger.info("MarketController class end addMerket() method response is..."+response);
		return new ResponseEntity<MarketResponse>(response,HttpStatus.CREATED);
	}
	
	@GetMapping(value="getMarketInfo",produces="application/json")
	public ResponseEntity<Market> getMarketInfo(@RequestParam long marketId){
		logger.info("MarketController class start addMarket() method request is...");
		Market market=marketService.getMarketInfo(marketId);
		logger.info("MarketController class end getMarketInfo() method response is..."+market);
		return new ResponseEntity<Market>(market,HttpStatus.OK);
	}
	
	@GetMapping(value="/marketList",produces="application/json")
	public ResponseEntity<List<Market>> marketList(){
		logger.info("MarketController class start marketList() method request is...");
		List<Market> market=marketService.marketList();
		logger.info("MarketController class end marketList() method response is..."+market);
		return new ResponseEntity<List<Market>>(market,HttpStatus.OK);
	}
	
	@PutMapping(value="/updateMarket",consumes="application/json",produces="application/json")
	public ResponseEntity<Market> updateMarket(@RequestParam long marketId,
			@RequestBody MarketRequest request){
		logger.info("MarketController class start updateMarket() method request is..."+request);
		Market market=marketService.updateMarket(marketId,request);
		return new ResponseEntity<Market>(market,HttpStatus.OK);
	}
	@DeleteMapping(value="/deleteMarketInfo")
	public ResponseEntity<String> deleteMarketInfo(@RequestParam long marketId){
		marketService.deleteMarketInfo(marketId);
		return new ResponseEntity<String>("delete successfully...",HttpStatus.OK);
	}

}
