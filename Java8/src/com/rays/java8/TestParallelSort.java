package com.rays.java8;

import java.util.Arrays;

public class TestParallelSort {

	public static void main(String[] args) {

		int[] array = { 0, 8, 9, 5, 2, 3, 1, 4, 6, 7 };

		Arrays.parallelSort(array);
		
		for(int a : array) {
			System.out.println(a);
			
		}
	}
}
