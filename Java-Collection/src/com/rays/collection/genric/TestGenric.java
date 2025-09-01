package com.rays.collection.genric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestGenric {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer integer =  it.next();
			System.out.println(integer);
			
		}
		
	}
	
}
