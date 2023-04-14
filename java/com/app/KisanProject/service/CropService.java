package com.app.KisanProject.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.KisanProject.dto.CropRequest;
import com.app.KisanProject.dto.CropResponse;
import com.app.KisanProject.entity.Crop;
import com.app.KisanProject.repository.CropRepository;

@Service
public class CropService {
	@Autowired
	private CropRepository cropRepo;
	Logger logger=LoggerFactory.getLogger(CropService.class);
	CropResponse response=new CropResponse();

	public CropResponse addCrop(CropRequest request) {
		// TODO Auto-generated method stub
		logger.info("CropService class start addCrop() method request is..."+request);
		Crop crop=CreateCropObject(request);
		Crop c=cropRepo.save(crop);
		if(c!=null) {
			response.setResponse(c);
			response.setStatus("crop added in database..");
		}
		else {
			response.setResponse(c);
			response.setStatus("crop not added in database...");
		}
		logger.info("CropService class end addCrop() method response is..."+response);
		return response;
	}

	private Crop CreateCropObject(CropRequest request) {
		// TODO Auto-generated method stub
		Crop crop=new Crop();
		crop.setCropName(request.getCropName());
		crop.setCropType(request.getCropType());
		crop.setSeason(request.getSeason());
		crop.setSoil(request.getSoil());
		return crop;
	}

	public List<Crop> listCrop() {
		// TODO Auto-generated method stub
		return cropRepo.findAll();
	}

	public Crop updateCrop(int cropId, CropRequest request) {
		// TODO Auto-generated method stub
		logger.info("CropService class start updateCrop() method request is..."+request);
		Crop c=cropRepo.findById(cropId).get();
		Crop c1=null;
		if(c!=null) {
			c.setCropName(request.getCropName());
			c.setCropType(request.getCropType());
			c.setSeason(request.getSeason());
			cropRepo.save(c);
		}
		return c1;
	}

	public void deleteCrop(int cropId) {
		// TODO Auto-generated method stub
		cropRepo.deleteById(cropId);
		
	}

	public Crop getCropById(int cropId) {
		// TODO Auto-generated method stub
		return cropRepo.findById(cropId).get();
	}

}
