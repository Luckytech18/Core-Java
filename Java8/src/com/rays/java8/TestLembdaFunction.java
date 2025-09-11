package com.rays.java8;

public class TestLembdaFunction {

	public static void main(String[] args) {

		TestFunctionalInterface f = (i, j) -> {
			return i + j;
		};
		
		int i = 5;
		int j = 10;
		
		System.out.println(f.sum(i, j));
	}

}
