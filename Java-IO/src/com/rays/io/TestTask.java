package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestTask {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader file = new BufferedReader(new FileReader("C:\\TestJava\\Hello.txt"));
		BufferedReader file1 = new BufferedReader(new FileReader("C:\\TestJava\\HelloWorld.txt"));
		BufferedWriter file2 = new BufferedWriter(new FileWriter("C:\\TestJava\\HelloTesting.txt"));
		
		String s = file.readLine();
		String s1 = file1.readLine();
		
		while (s != null) {
			System.out.println(s);
			file2.write(s);
			file2.newLine();
			s = file.readLine();
			
			
		}
		while (s1 != null) {
			System.out.println(s1);
			file2.write(s1);
			s1 = file.readLine();
		
	}
		file.close();
		file1.close();
		file2.close();

}
}