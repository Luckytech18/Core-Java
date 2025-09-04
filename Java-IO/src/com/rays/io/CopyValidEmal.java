package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyValidEmal {

	public static void main(String[] args) throws IOException {

		BufferedReader OldEmail = new BufferedReader(new FileReader("C:\\TestJava\\ValidEmail.txt"));
		BufferedWriter NewEmail = new BufferedWriter(new FileWriter("C:\\TestJava\\OnlyValidEmails"));

		String email = OldEmail.readLine();

		while (email != null) {
			if (email.endsWith("@gmail.com")) {
				System.out.println("Valid email" + email);
				NewEmail.write(email);
				NewEmail.newLine();

			}
			email = OldEmail.readLine();

		}
		System.out.println("valid email copy successfully");
		OldEmail.close();
		NewEmail.close();
	}

}
