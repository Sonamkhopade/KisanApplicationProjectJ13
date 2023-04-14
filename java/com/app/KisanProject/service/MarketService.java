package com.app.KisanProject.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.KisanProject.dto.MarketRequest;
import com.app.KisanProject.dto.MarketResponse;
import com.app.KisanProject.entity.Market;
import com.app.KisanProject.repository.MarketRepository;

@Service
public class MarketService {
	@Autowired
	private MarketRepository marketRepo;
	Logger logger=LoggerFactory.getLogger(MarketService.class);
	MarketResponse response=new MarketResponse();

	public MarketResponse addMarket(MarketRequest request) {
		// TODO Auto-generated method stub
		logger.info("MarketService class start addMarket() method request is..."+request);
		Market market=CreateMarketObject(request);
		Market m=marketRepo.save(market);
		if(m!=null) {
			response.setResponse(m);
			response.setStatus("market added successfully...");
		}
		else {
			response.setResponse(m);
			response.setStatus("failed to add in database...");
		}
		logger.info("MarketService class end addMarket() method request is..."+response);
		return response;
	}

	private Market CreateMarketObject(MarketRequest request) {
		// TODO Auto-generated method stub
		Market market=new Market();
		market.setMarketName(request.getMarketName());
		market.setArrival(request.getArrival());
		market.setPrice(request.getPrice());
		market.setGarade(request.getGarade());
		return market;
	}

	public Market getMarketInfo(long marketId) {
		// TODO Auto-generated method stub
		return marketRepo.findById(marketId).get();
	}

	public List<Market> marketList() {
		// TODO Auto-generated method stub
		return marketRepo.findAll();
	}

	public Market updateMarket(long marketId, MarketRequest request) {
		// TODO Auto-generated method stub
		logger.info("MarketService class start updateUser() method request is..."+request);
		Market m=marketRepo.findById(marketId).get();
		Market m1=null;
		if(m!=null) {
			m.setMarketName(request.getMarketName());
			m.setPrice(request.getPrice());
			m.setArrival(request.getArrival());
			m.setGarade(request.getGarade());
			marketRepo.save(m);
		}
			return m1;
		}

	public void deleteMarketInfo(long marketId) {
		// TODO Auto-generated method stub
		marketRepo.deleteById(marketId);
		
	}

}
