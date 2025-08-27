package com.rays.collection.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 5);
		m.put("six", 6);
		System.out.println(m.entrySet());
		System.out.println(m.containsKey("one"));
		System.out.println(m.containsValue(3));
		System.out.println(m.get("two"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.size());
		m.remove("one", 1);
		System.out.println(m.size());
		m.clear();
		System.out.println(m);
	}

}
