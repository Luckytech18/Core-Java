package com.rays.collection.map;

import java.util.HashMap;
import java.util.Map;

public class TestGenricMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		
		System.out.println(m);
	}

}
