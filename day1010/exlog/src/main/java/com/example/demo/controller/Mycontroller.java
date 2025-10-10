package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	private static final Logger log = LoggerFactory.getLogger(Mycontroller.class);
	@GetMapping("/")
	public String getMethodName() {
		System.out.println("println ====== Welcome");
		log.info("println ====== Welcome");
		return "Welcome";
	}
}
