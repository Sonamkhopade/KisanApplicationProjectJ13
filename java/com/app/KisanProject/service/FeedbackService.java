package com.app.KisanProject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.KisanProject.entity.Feedback;
import com.app.KisanProject.repository.FeedbackRepository;

@Service
public class FeedbackService {
	@Autowired
	private FeedbackRepository feedbackRepo;
	Logger logger=LoggerFactory.getLogger(FeedbackService.class);
	Feedback response=new Feedback();

	public Feedback addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		logger.info("FeedbackService class start addFeedback() method request is"+feedback);
		Feedback f=feedbackRepo.save(feedback);
		logger.info("FeedbackService class end addFeedback() method response is"+response);
		return f;
	}

	public void removeFeedback(long id) {
		// TODO Auto-generated method stub
		feedbackRepo.deleteById(id);
	}

}
