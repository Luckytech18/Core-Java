package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderByRollno implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		return o1.rollno - o2.rollno;
	}

}
