package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.MyService;

@RestController
public class MyController {

	MyService myService;
	
	public MyController(MyService myService) {
		this.myService = myService;
	}
	
	@GetMapping("/")
	public String getMethodName() {
		return myService.sayHello("안녕");
	}
	
	@GetMapping("/ex70")
	public String getEx70() {
		return myService.ex70();
	}
	
	@GetMapping("/ex70_int")
	public Integer ex70_int() {
		return myService.ex70_int();
	}
	
	@GetMapping("/em72_for")
	public String em72_for() {
		return myService.ex72_for();
	}
	
	@GetMapping("/em73_while")
	public String em73_while() {
		return myService.em73_while();
	}
	
	@GetMapping("/em76_list")
	public String em76_list() {
		return myService.em76_list();
	}
	
	@GetMapping("/em77_list")
	public String em77_list() {
		return myService.em77_list();
	}
	
	@GetMapping("/em79_same")
	public String em79_same() {
		return myService.em79_same();
	}
	
	@GetMapping("/em88_api")
	public String em88_api() {
		return myService.em88_api();
	}
	
	@GetMapping("/em89_stream")
	public String em89_stream() {
		return myService.em89_stream();
	}
	
	@GetMapping("/em89_for")
	public String em89_for() {
		return myService.em89_for();
	}
	
	@GetMapping("/em91_for")
	public String em91_for() {
		return myService.em91_for();
	}
}
