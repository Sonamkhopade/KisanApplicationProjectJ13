package com.app.KisanProject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.KisanProject.entity.Feedback;
import com.app.KisanProject.service.FeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackService;
	Logger logger=LoggerFactory.getLogger(FeedbackController.class);
	
	@PostMapping(value="/addFeedback",consumes="application/json", produces="application/json")
	public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback feedback){
		logger.info("FeedBackController class start addFeedback() method request is"+feedback);
		Feedback response=feedbackService.addFeedback(feedback);
		logger.info("FeedBackController class end addFeedback() method response is"+response);
		return new ResponseEntity<Feedback>(response,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/removeFeedback")
	public ResponseEntity<String> removeFeedback(@RequestParam long id){
		feedbackService.removeFeedback(id);
		return new ResponseEntity<String>("deleted successfully...",HttpStatus.OK);
	}

}
