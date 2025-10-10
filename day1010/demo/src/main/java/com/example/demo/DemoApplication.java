package com.example.demo;
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
    @GetMapping("/")
    public String getMethodBin() {
    	return "<h1>hallo 여기는 루트 경로</h1>";
    }
    @GetMapping("/hello")
    public String getMethodName(@RequestParam("name") String name) {
    	return "<h1>Hello "+name+"</h1>";
    }
    @GetMapping("hello2")
    public String hello2(@RequestParam(value="name", defaultValue="World") String name) {
    	return "Hello "+name;
    }
    @GetMapping("/hello3")
    public String hello3(@RequestParam(name = "name", defaultValue="world") String name) {
    	return "Hello3 " +name;
    }
}