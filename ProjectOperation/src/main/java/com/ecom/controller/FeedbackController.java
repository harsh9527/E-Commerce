package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Feedback;
import com.ecom.service.FeedbackService;

@RestController
public class FeedbackController {

	@Autowired
	private FeedbackService service;
	
	@PostMapping("/saveFeedback")
	public ResponseEntity<Feedback> saveFeedback(@RequestBody Feedback feedback)
	{
		Feedback feedback2=service.savFeedback(feedback);
		return ResponseEntity.ok().body(feedback2);
	}
	
}
