package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWriteBinaryFile {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("C:\\TestJava\\ViratKohli.png");
		FileOutputStream out = new FileOutputStream("C:\\TestJava\\KingKohli.png");
		
		int i = in.read();
		
		while (i != -1 ) {
			System.out.println(i);
			out.write(i);
			i = in.read();
		
			
		}
		in.close();
		out.close();
	}

}
