package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteText {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("C:\\TestJava\\Java.txt");

		file.write("Hello Lucky\nok");

		System.out.println("Write Successfully");

		file.close();

	}

}
