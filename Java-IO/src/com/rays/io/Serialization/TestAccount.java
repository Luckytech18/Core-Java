package com.rays.io.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccount {

	public static void main(String[] args) throws Exception, IOException {
		
		Account a = new Account("89497524932", 2000.0);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\TestJava\\Account.txt"));
	
		// Convert Account class object into byte stream: serialization
		out.writeObject(a);
		
		out.close();
		System.out.println("object write successfully");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\TestJava\\Account.txt"));
		
		// Convert byte stream into Account class object: deserialization
		
		a = (Account)in.readObject();
		System.out.println(a);
		
		in.close();
		
	}
}
