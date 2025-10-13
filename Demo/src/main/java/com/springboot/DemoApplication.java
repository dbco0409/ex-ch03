package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String getMethodName(@RequestParam("name") String name) {
		return String.format("Hello111 %s!",  name);
	}
	
	
	@GetMapping("/hello2")
	public String getMethodName2(@RequestParam("name222") String name) {
		return String.format("Hello2222 %s!",  name);
	}
	
	@GetMapping("/hello3")
	public String getMethodName3(@RequestParam(value="name", defaultValue = "world") String name) {
		return String.format("Hello3333 %s!",  name);
	}
	
	@GetMapping("/hello4")
	public String getMethodName4(@RequestParam("name333") String name3) {
		return String.format("hello3333 %s!",  name3);
	}

}
