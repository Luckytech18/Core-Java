package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class SplitingTheFile {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\TestJava\\HelloTesting.txt"));
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\TestJava\\Split1.txt"));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\TestJava\\Split2.txt"));
		BufferedWriter bw3 = new BufferedWriter(new FileWriter("C:\\TestJava\\Split3.txt"));
		
		String line = br.readLine();
		
		
	}

}
