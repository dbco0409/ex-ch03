package com.springboot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.service.ExService;
import com.springboot.demo.service.ExService.Car;
import com.springboot.demo.service.ExService.K5;
import com.springboot.demo.service.ExService.Sonata;

@RestController
public class ExController {
	
	private static final Logger Log = LoggerFactory.getLogger(ExController.class);
	
	ExService exService;
	public ExController(ExService exService) {
		this.exService = exService;
	}
	
	@GetMapping("/")
	public String getMethodName() {
		return exService.sayHello("안녕");
	}
	
	@GetMapping("/ex321")
	public String getEx321() {
		int number = 1;
		String result = "";
		if(number == 1) {
			result = "if 블록 입니다.";
			System.out.println("if블록 입니다.");
		}else if(number == 1) {
			result = "else if 블록 입니다.";
			System.out.println("else if 블록 입니다.");
		}else {
			result = "else 블록 입니다.";
			System.out.println("else 블록 입니다.");
		} 
		return result;
	}
	
	
	public interface Car{
		public String getColor();
	}
	
	public class Sonata implements Car {
		public Sonata() {
			Log.info("=====출고====Sonata");
		}

		@Override
		public String getColor() {
			return "==== 색상 : Red ==== Sonata";
		}	
	}
	
	public class K5 implements Car {
		public K5() {
			Log.info("====출고====k5");
		}
		@Override
		public String getColor() {
			return "==== 색상 : Yellow ===== k5";
		}
	}
	
	@GetMapping("/ex324")
	public String ex324() {
		Car car1 = new Sonata();
		String re1 = car1.getColor();
		Car car2 = new K5();
		String re2 = car2.getColor();
		
		String result = re1 + "<br/>" + re2 + "<br/>" + "차 두대를 출고하였음";
		return result;
	}
}
