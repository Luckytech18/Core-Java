package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) throws IOException {

		FileReader file = null;

		try {
			file = new FileReader("C:\\TestJava\\Hello.txt");

			int i = file.read();
			while (i != -1) {
				System.out.print((char) i);
				i = file.read();
			}

		} catch (Exception e) {
			System.out.println("excpetion: " + e.getMessage());
		} finally {
			file.close();
		}

	}

}
