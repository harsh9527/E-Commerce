package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Feedback;
import com.ecom.repository.FeedbackRepository;
import com.ecom.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	private FeedbackRepository repository;
	
	
	@Override
	public Feedback savFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return repository.save(feedback);
	}

	
}
