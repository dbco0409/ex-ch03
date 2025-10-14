package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ExService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ExController {
	
	ExService exService;
	
	public ExController(ExService exService) {
		this.exService = exService;
	}
	

	@GetMapping("/")
	public String getMethodName() {
		return exService.sayHello("안녕");
	}
	
	// http://localhost:8080/ex3_2_1?num=5
	@GetMapping("/ex3_2_1")
	public String getEx3_2_1(@RequestParam(value="num", defaultValue="1") String param) {
		return exService.ex3_2_1(param);
	}
	
	// http://localhost:8080/ex3_2_4
	@GetMapping("/ex3_2_4")
	public String getEx_3_2_4() {
		return exService.ex3_2_4();
	}
	
	// http://localhost:8080/ex3_2_5?idx=1
	@GetMapping("/ex3_2_5")
	public String getEx3_2_5(@RequestParam (value="idx", defaultValue="0") String param) {
		return exService.ex3_2_5(param);
	}
	
	// http://localhost:8080/ex3_2_6?search=void
	@GetMapping("ex3_2_6")
	public String getEx3_2_6(@RequestParam(value="search") String param) {
		return exService.ex3_2_6(param);
	}
	
	// http://localhost:8080/ex3_3_6
	@GetMapping("/ex3_3_6")
	public String getEx3_3_6() {
		return exService.ex3_3_6();
	}
	
	// http://localhost:8080/ex3_3_7
	@GetMapping("/ex3_3_7")
	public String getEx3_3_7() {
		return exService.ex3_3_7();
	}
	
	// http://localhost:8080/ex3_3_8
	@GetMapping("/ex3_3_8")
	public String getEx3_3_8() {
		return exService.ex3_3_8();
	}	
}
