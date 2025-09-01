package com.rays.collection.sorting;

public class Employee implements Comparable<Employee> {

	public String name;
	public int id;
	public int salary;
	
	public Employee (String name , int id , int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String toString() {
		return "id:" + id + "Salary:" + salary +"name:" + name; 
	}
	
	@Override
	public int compareTo(Employee o) {
		
		return o.id - this.id;
		//return this.id - o.id;
		
		//return o.salary - this.salary;
		//return this.salary - o.salary;
		
		//return o.name.compareTo(this.name);
		//return this.name.compareTo(o.name);
	}
	
	
	
	
}
