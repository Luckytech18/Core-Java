package com.rays.Exception;

public class TestException {
	public static void main(String[] args) {

		try {
			String name = "lucky";
			System.out.println(name.length());
			System.out.println(name.charAt(7));
		} catch (NullPointerException e) {
			System.out.println("Exception:" + e.getMessage());

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Exception1:" + e.getMessage());
		} finally {
			System.out.println("Program is always run");
		}
	}

}
