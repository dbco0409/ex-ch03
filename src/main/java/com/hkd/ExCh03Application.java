package com.hkd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages = { "com.hkd.demo", "com.hkd.mybatis", "com.hkd.ex_thymleaf" })
//@MapperScan("com.hkd.mybatis")
@SpringBootApplication
public class ExCh03Application {

	public static void main(String[] args) {
		SpringApplication.run(ExCh03Application.class, args);
	}

}
