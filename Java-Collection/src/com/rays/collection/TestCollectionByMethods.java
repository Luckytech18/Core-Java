package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionByMethods {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		
		
		c1.add("lucky");
		c1.add('a');
		c1.add(2.2);
		c1.add(true);
		c1.add(5);

		System.out.println("c1:" + c1);

		Collection c2 = new ArrayList();

		c2.add("ram");
		c2.add('b');
		c2.add(3.3);
		c2.add(29);
		c2.add(false);
		
		
		c1.addAll(c2);
		
		c1.remove("lucky");
		
		c2.remove(3.3);
		
		c1.removeAll(c2);
		
		System.out.println("c2:" + c2);
		System.out.println("c1" + c1);

	}

}
