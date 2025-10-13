package com.springboot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	private static final Logger Log = LoggerFactory.getLogger(MyController.class);
	@GetMapping("/")
	public String getMethodName() {
		System.out.println("println ======= Welcome");
		Log.info("log.info ========= Welcome");
		return "환영합니다.";
	}
}
