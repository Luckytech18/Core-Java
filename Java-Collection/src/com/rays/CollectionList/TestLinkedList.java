package com.rays.CollectionList;

import java.util.LinkedList;

public class TestLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(0 , "lucky");
		list.add(1 , 'a');
		list.add(2 , true);
		list.add(3 , 2.2);
		
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println();
		list.add(3 , "mango");
		System.out.println(list);
	}

}
