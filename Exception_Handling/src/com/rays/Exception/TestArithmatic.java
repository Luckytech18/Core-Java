package com.rays.Exception;

public class TestArithmatic {
	public static void main(String[] args) {
		try {
			int a = 15;
			int b = 0;
			int div = a / b;

			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Program Finished");
		}
	}

}
