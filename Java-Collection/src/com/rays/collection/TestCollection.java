package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(18);
		c.add("Lucky");
		c.add(true);
		c.add('a');
		c.add(2.2);
		
		System.out.println("c:" + c); 
		System.out.println("--------------");
		 for (Object o : c) {
			 System.out.println(o);
			
		}
	}

}
