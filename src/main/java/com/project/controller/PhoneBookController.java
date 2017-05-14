package com.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PhoneBookController {
	private static final Logger logger = LoggerFactory.getLogger(PhoneBookController.class);
	
	@RequestMapping(value="/")
	public String info()
	{
		logger.debug("This is a test for logger creation");
		return "This app is for Phone and Password Safe";
		
	}
	
}
