package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderByPhysicsNo implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		if (o1.physics == o2.physics) {
			return o1.rollno - o2.rollno;
		} else {
			return o1.physics - o2.physics;

		}
	}
	
	

}
