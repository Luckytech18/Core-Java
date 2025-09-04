package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextByBufferedWriter {
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter file = new  BufferedWriter(new FileWriter("C:\\TestJava\\HelloWorld.txt"));
		
		file.write("Lucky Tomar\n Gwalior");
		
		System.out.println("File Write Successfully");
		file.close();
	}

}
