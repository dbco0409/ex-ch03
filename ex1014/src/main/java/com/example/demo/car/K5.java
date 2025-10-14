package com.example.demo.car;

import org.slf4j.Logger;

public class K5 implements Car{
	private Logger log;
	
	public K5(Logger log) {
		this.log = log;
		log.debug("=== K5 출고 === (constructor)");
	}
	
	@Override
	public String getColor() {
		String result = "=== K5 : Snow White Pearl ==="; 
		log.debug(result);
		return result;
	}

}
