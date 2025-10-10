package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExlogApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ExlogApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ExlogApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run() {
		return args -> {
			log.info("======================");
			log.debug("디버그 레벨");
			log.warn("경고 레벨");
			log.error("에러 레벨");
		};
	}

}
