package com.springboot.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.springboot.demo.controller.ExController.Car;

@Service
public class ExService {
	
	private static final Logger Log = LoggerFactory.getLogger(ExService.class);
			
	public String sayHello(String hi) {
		String msg = hi + ", 좋은날!";
		
		Log.info(msg);
		Log.debug(msg);
		return msg;
	}

	
	
}
