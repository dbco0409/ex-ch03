package com.example.demo.car;

import org.slf4j.Logger;

public class Sonata implements Car {
	private Logger log;

	public Sonata(Logger log) {
		this.log = log;
		log.debug("=== Sonata 출고 === (constructor)");
	}
	
	@Override
	public String getColor() {
		String result = "=== Sonata : BLUE ==="; 
		log.debug(result);
		return result;
	}
}
