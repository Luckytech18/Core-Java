package com.rays.CollectionList;

import java.util.ArrayList;
import java.util.List;

public class TestListCollection {
	
	public static void main(String[] args) {
		
		//1.List can contain duplicate values
		//2.List can contain multiple null values
		//3.Order of list is natural order
		
		List list = new ArrayList();
		
		list.add(3);
		list.add("Lucky");
		list.add(9.9);
		list.add(true);
		list.add('a');
		
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println(list.indexOf("Lucky"));
		System.out.println(list.lastIndexOf("Lucky"));
		System.out.println(list.subList(0, 4));
		
	}

}
