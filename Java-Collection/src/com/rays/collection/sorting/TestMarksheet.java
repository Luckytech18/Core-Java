package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) {

		List<Marksheet> list = new ArrayList<Marksheet>();

		list.add(new Marksheet(18, "Lucky", 20, 60, 40));
		list.add(new Marksheet(21, "Jayesh", 20, 20, 10));
		list.add(new Marksheet(14, "Kumar", 20, 40, 35));
		list.add(new Marksheet(15, "Singh", 25, 70, 85));

		list.forEach(System.out::println);
		System.out.println("--------------");

		OrderByName byname = new OrderByName();
		
		System.out.println("------sort by name----");
		Collections.sort(list, byname);
		list.forEach(System.out::println);
		
		System.out.println("--------------");
		
		OrderByRollno rollno = new OrderByRollno();
		
		System.out.println("----sort by rollno----");
		Collections.sort(list, rollno);
		list.forEach(System.out::println);
		
		System.out.println("--------------");
		System.out.println("----sort by physicsNo----");
		
		OrderByPhysicsNo byPhysicsNo = new OrderByPhysicsNo();
		
		Collections.sort(list, byPhysicsNo);
		list.forEach(System.out::println);

	}

}
