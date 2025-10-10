package com.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	private static final Logger Log = LoggerFactory.getLogger(MyService.class);
	
	public String sayHello(String greeting) {
		String msg = greeting + " 좋은 하루~!";
		System.out.println(msg);
		Log.info(msg);
		return msg;
	}

	public String ex70() {
		String msg;
		Log.info("ex70 결과는 ");
		int number = 1;
		if(number == 1)
			msg="if블록입니다.";
		else if(number==2) 
			msg="else if 블록 입니다.";
		else
			msg="else 블록 입니다.";
		
		Log.info(msg);
		return msg;
	}

	public Integer ex70_int() {
		return 999;
	}

	public String ex72_for() {
		String msg = null;
		int[] array = {1,2,3,4,5};
		for(int i=0; i<array.length; i++) {
			msg = "i: "+ array[i];
			Log.info(msg);
		}
		return msg;
	}

	public String em73_while() {
		String msg = null;
		int[] array = {1,2,3,4,5};
		int i=0;
		while(i<array.length) {
			msg = "i:"+array[i];
			Log.info(msg);
			i++;
		}
		return msg;
	}

	public String em76_list() {
		String msg = null;
		List list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		msg = list.get(1) + "";
		Log.info(msg);
		return msg;
	}

	public String em77_list() {
		List list = new ArrayList<String>();
		list.add("public");
		list.add("static");
		list.add("void");
		
		for(int i = 0; i<list.size(); i++) {
			Log.info(list.get(i)+"");
		}
		list.remove(1);
		int voidIndex = list.indexOf("void");
		Log.info(voidIndex+"");
		
		return voidIndex;
	}

	public String em79_same() {
		String str1 = new String("is same?");
		String str2 = new String("is same?");
		String msg = (str1==str2)? "true":"false";
		Log.info(msg);
		String msg2 = str1.equals(str2)+"";
		
		Log.info(msg2);
		return msg2;
	}

	public String em88_api() {
		List list = new ArrayList<String>();
		list.add("public");
		list.add("static");
		list.add("void");
		for(int i=0; i<list.size(); i++) {
			Log.info(list.get(i)+"");
		}
		return null;
	}

	public String em89_stream() {
		List list = new ArrayList<String>();
		
		list.add("public");
		list.add("static");
		list.add("void");
		
		list.stream().forEach(str->Log.info(str+""));
		return null;
	}

	public String em89_for() {
		Integer[] integerArray = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list = Arrays.asList(integerArray);
		
		List evenList = new ArrayList<Integer>();
		for(int i=0; i<list.size(); i++) {
			Integer number = list.get(i);
			if(number % 2 == 0) {
				evenList.add(number);
			}
		}
		
		for(int i=0; i<evenList.size(); i++) {
			Log.info(evenList.get(i)+"");
		}
		return null;
	}

	public String em91_for() {
		Integer[] integerArray = new Integer[] {1,2,3,4,5};
		List<Integer> list = Arrays.asList(integerArray);
		list.stream().forEach(value->Log.info(value+ ""));
		
		return null;
	}

}
