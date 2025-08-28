package com.rays.collection.queue;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestFailSafe {
	
	public static void main(String[] args) {
	
		Vector v = new Vector();

		v.add("Ram");
		v.add('a');
		v.add(56);
		v.add("Ram");
		v.add("Ram");
		v.add(null);
		v.add(null);
		
		Enumeration e = v.elements();
		v.add(15);
		
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
			
		}
	}
	
}
