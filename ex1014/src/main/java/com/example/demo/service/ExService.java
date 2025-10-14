package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.car.Car;
import com.example.demo.car.K5;
import com.example.demo.car.Sonata;

@Service
public class ExService {
	
	private static final Logger log = LoggerFactory.getLogger(ExService.class);

	public String sayHello(String msg) {
		msg += " 좋은날!";
		System.out.println(msg);
		log.info("=== sayHello method === : {}", msg);
		return msg;
	}

	public String ex3_2_1(String param) {
		int sel;
		String msg;
		try {
			sel = Integer.parseInt(param);
		} catch(NumberFormatException e) {
			log.debug(e.toString());
			sel = -1;
		}
		
		if(sel == 1) {
			msg = "if 블록입니다";
		}
		else if (sel == 2) {
			msg = "else if 블록입니다";
		}
		else if (sel == -1){
			msg = "입력값이 올바르지 않습니다.";
		}
		else{
			msg = "else 블록입니다";
		}

		log.info("=== method: ex3_2_1, msg={}", msg);
		return msg;
	}

	// 다형성 : 상속과 인터페이스
	// p74. 3.2.4
	public String ex3_2_4() {
		String result = "=== 자동차 2대 출고 완료! ===<br>";

		Car car1 = new Sonata(log);
		result += car1.getColor() + "<br>";
		
		Car car2 = new K5(log);
		result += car2.getColor();
		
		log.debug(result);
		return result;
	}
	
	// 컬렉션 : List
	// P76 3.2.5
	public String ex3_2_5(String param) {
		int idx;
		
		try {
			idx = Integer.parseInt(param);
			log.debug("--- ex3_2_5. index = {} ---", idx);
		}
		catch(NumberFormatException e) {
			idx = 0;
			log.debug(e.toString());
		}
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		if(idx < list.size()) {
			String result = "--- list[" + idx + "] = " + list.get(idx) + " ---"; 
			log.debug(result);
			return result;
		}
		
		return "인덱스가 리스트의 범위를 벗어나서 값을 가져올 수 없습니다.";
	}
	
	// ArrayList
	// p77 3.2.6, p88 stream api
	public String ex3_2_6(String param) {
		List<String> list = new ArrayList<String>();
		list.add("public");
		list.add("static");
		list.add("void");

		String result = "=== Array List item : List 순회 방식 ===<br>";

		// p77 3.2.6		
		for (String l : list) {
			result += (l + " ");
		}
		
		// p88 stream api
		result += "<br>=== Array List item : Stream API 활용 ===<br>";
		StringBuilder sbResult = new StringBuilder();
		list.stream().forEach(str -> sbResult.append(str).append(" "));
		result += sbResult.toString();
		
		log.debug(result);
		result += "<br>";
		
		//list.remove(1);
		int searchIdx = list.indexOf(param);
		if(searchIdx < 0)
			result += ("=== " + param + "은 리스트에 없는 아이템입니다. ===");
		else
			result += ("=== " + param + "의 인덱스 : " + searchIdx + " ===");
		
		log.debug(result);
		return result;
	}
	
	// Stream API - filter()
	// p92 3.3.6
	public String ex3_3_6() {
		Integer[] integerArray = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> list = Arrays.asList(integerArray);
		
		List evenList = list.stream().filter(value->value%2==0).toList();
		
		return evenList.toString();
	}
	
	// Stream API - distinct()
	// p93 3.3.7
	public String ex3_3_7() {
		Integer[] integerArray = new Integer[] {1,1,1,1, 2,2,2, 3,3, 4};
		List<Integer> list = Arrays.asList(integerArray);
		
		List<Integer> distinctList = list.stream().distinct().toList();
		return distinctList.toString();
	}
	
	// Stream API - map()
	// p93 3.3.8
	public String ex3_3_8() {
		String[] lowercaseArray = new String[] {"public", "static", "void"};
		List<String> lowercaseList = Arrays.asList(lowercaseArray);
		
		List<String> uppercaseList = lowercaseList.stream().map(value->value.toUpperCase()).toList();
		return uppercaseList.toString();
	}
}
