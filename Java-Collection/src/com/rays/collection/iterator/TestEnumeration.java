package com.rays.collection.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("Lucky");
		v.add(2);
		v.add(2.3);
		v.add('a');
		v.add(true);
		
		System.out.println(v);
		System.out.println(v.firstElement());
		
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o); 
			
		}
	}

}
