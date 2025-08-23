package com.rays.Exception;

public class UncheckedException {
	
	public static void main(String[] args) {
		dad();
	}

	private static void dad() {
		
		System.out.println("In Dad");
		
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());

		}

	}

	private static void mom() {

		son();
		}

	private static void son() {

		throw new RuntimeException("make a mistake");

	}

}
