package com.rays.Stream;

import java.util.ArrayList;

public class TestStream {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(18);
		list.add(15);
		list.add(29);
		list.add(12);
		list.add(20);
		list.add(14);
		
		System.out.println("list:" + list);
		
		list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println("even: " + e));
		list.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.println("Odd:" + e));
		
	}

}
