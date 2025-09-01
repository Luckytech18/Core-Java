package com.rays.equalsandhashcode;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Lucky", "Gwalior");
		Student s2 = new Student("Lucky", "Gwalior");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
