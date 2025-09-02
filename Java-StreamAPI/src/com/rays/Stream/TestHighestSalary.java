package com.rays.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestHighestSalary {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("5000");
		list.add("4000");
		list.add("6000");
		list.add("3000");
		list.add("2000");
		list.add("1000");
		
		
		System.out.println("---First Highest----");
		list.stream().distinct().max(Comparator.naturalOrder()).ifPresent(System.out::println);
		
		System.out.println("-----Second Highest----");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
		
		System.out.println("-----Buuble Short Desc----");
		list.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		System.out.println("-----Buuble Short ascen----");
		list.stream().distinct().sorted().forEach(System.out::println);
		
	}
}
