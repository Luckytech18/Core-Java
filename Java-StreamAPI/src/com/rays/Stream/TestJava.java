package com.rays.Stream;

import java.util.ArrayList;

public class TestJava {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Lucky");
		list.add("Karan");
		list.add("Arjun ");
		list.add("Bheem");
		list.add("Jaggu");
		list.add("Jaggu");
		list.add("Patlu");
		
		list.forEach(System.out::println);
		System.out.println("--------------");
		list.stream().distinct().forEach(e -> System.out.println(e));
		System.out.println("--------------");
		list.stream().distinct().sorted().forEach(e -> System.out.println(e));
		System.out.println("--------------");
		list.stream().distinct().filter(e -> e.startsWith("L")).forEach(e -> System.out.println(e));
		System.out.println("---------------");
		list.stream().distinct().limit(4).forEach(e -> System.out.println(e));
		
		
	}

}
