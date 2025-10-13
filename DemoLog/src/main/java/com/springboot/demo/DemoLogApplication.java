package com.springboot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoLogApplication {
	private static final Logger Log = LoggerFactory.getLogger(DemoLogApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoLogApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run() {
		return args -> {
			Log.info("==================");
			Log.debug("디버그 레벨");
			Log.warn("경고 레벨");
			Log.error("경고 레벨");
			Log.info("==================");
		};
	}

}
