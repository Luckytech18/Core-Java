package com.rays.io;

import java.io.*;

public class SimpleLineSplitter {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\TestJava\\HelloTesting.txt"));

			String line1 = br.readLine();
			String line2 = br.readLine();
			String line3 = br.readLine();

			FileWriter fw1 = new FileWriter("C:\\TestJava\\line1.txt");
			fw1.write(line1);
			fw1.close();

			FileWriter fw2 = new FileWriter("C:\\TestJava\\line2.txt");
			fw2.write(line2);
			fw2.close();

			FileWriter fw3 = new FileWriter("C:\\TestJava\\line3.txt");
			fw3.write(line3);
			fw3.close();

			br.close();

			System.out.println("Lines written to separate files successfully.");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
