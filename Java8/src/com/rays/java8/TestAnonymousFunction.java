package com.rays.java8;

public class TestAnonymousFunction {
	
	public static void main(String[] args) {
		
		TestFunctionalInterface f = new TestFunctionalInterface() {
			
			@Override
			public int sum(int i, int j) {
				
				return i + j;
			}
		};
		int i = 5;
		int j = 3;
		System.out.println(f.sum(i, j));
		
		f.m1();
		TestFunctionalInterface.m2();
	}

}
