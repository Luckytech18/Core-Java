package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextByBufferedReader {
	
	public static void main(String[] args) throws Exception {
		 
		BufferedReader file = new BufferedReader(new FileReader("C:\\TestJava\\Java.txt"));
		
		 String line = file.readLine();
		 
		 while (line != null) {
			 System.out.println(line);
			 line = file.readLine();
			
		}
		 file.close();
	}

}
