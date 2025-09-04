package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\TestJava\\Hello.txt");
		
		if (f.exists()) {
			
			System.out.println("File name:" + f.getName());
			System.out.println("Absolute Path:" + f.getAbsolutePath());
			System.out.println("can write :" + f.canWrite());
			System.out.println("can read " + f.canRead());
			System.out.println("is it a file " + f.isFile());
			System.out.println("is it a directory " + f.isDirectory());
			Date d = new Date(f.lastModified());
			System.out.println("last modified " + d);
			System.out.println("Size of the file " + f.length());
			
		} else {
			System.out.println("file not found");

		}
	}

}
