package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("Lucky", 4, 70000));
		list.add(new Employee("Shivam",5, 25000));
		list.add(new Employee("Mohit",2, 20000));
		list.add(new Employee("Core", 1, 400));
		list.add(new Employee("Alok", 3, 900000));
		
		list.forEach(System.out::println);
		
		System.out.println("-----------");
		
		Collections.sort(list);
		list.forEach(System.out::println);
		
		
	}
}
