package com.app.KisanProject.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.KisanProject.dto.FertilizerRequest;
import com.app.KisanProject.dto.FertilizerResponse;
import com.app.KisanProject.entity.Fertilizer;
import com.app.KisanProject.repository.FertilizerRepository;

@Service
public class FertilizerService {
	@Autowired
	private FertilizerRepository fertilizerRepo;
	Logger logger=LoggerFactory.getLogger(FertilizerService.class);
	FertilizerResponse response=new FertilizerResponse();

	public FertilizerResponse addFertilizer(FertilizerRequest request) {
		// TODO Auto-generated method stub
		logger.info("FertilizerService class start addFertilizer() method request is..."+request);
		Fertilizer fertilizer=CreateFertilizerObject(request);
		Fertilizer f=fertilizerRepo.save(fertilizer);
		if(f!=null) {
			response.setResponse(f);
			response.setStatus("fertilizer added in database....");
		}
		else {
			response.setResponse(f);
			response.setStatus("failed to add in database...");
		}
		logger.info("FertilizerService class end addFertilizer() method response is..."+response);
		return response;
	}

	private Fertilizer CreateFertilizerObject(FertilizerRequest request) {
		// TODO Auto-generated method stub
		Fertilizer fertilizer=new Fertilizer();
		fertilizer.setFertilizerName(request.getFertilizerName());
		fertilizer.setContent(request.getContent());
		fertilizer.setFertilizerType(request.getFertilizerType());
		fertilizer.setfPrize(request.getfPrize());
		fertilizer.setSoil(request.getSoil());
		fertilizer.setCrop(request.getCrop());
		return fertilizer;
	}

	public Fertilizer getFertilizer(int fertilizerId) {
		// TODO Auto-generated method stub
		return fertilizerRepo.findById(fertilizerId).get();
	}

	public List<Fertilizer> listFertilizer() {
		// TODO Auto-generated method stub
		return fertilizerRepo.findAll();
	}

	public Fertilizer updateFertilizer(int fertilizerId, FertilizerRequest request) {
		// TODO Auto-generated method stub
		logger.info("Fertilizercontroller class start updateFertilizer() method request is..."+request);
		Fertilizer f=fertilizerRepo.findById(fertilizerId).get();
		Fertilizer f1=null;
		
		if(f!=null) {
			f.setFertilizerName(request.getFertilizerName());
			f.setFertilizerType(request.getFertilizerType());
			f.setContent(request.getContent());
			f.setfPrize(request.getfPrize());
			fertilizerRepo.save(f);
		}
		return f1;
	}

	public void deleteFertilizer(int fertilizerId) {
		// TODO Auto-generated method stub
		fertilizerRepo.deleteById(fertilizerId);
		
	}

	
}
