package com.rays.io.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeByExternalizable {
	
	public static void main(String[] args) throws Exception {

		Employee e = new Employee(1, "Ram");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\TestJava\\TryExcel.xls"));

		out.writeObject(e);

		out.close();
		System.out.println("employee serialized successfully");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\TestJava\\TryExcel.xls"));

		e = (Employee) in.readObject();
		System.out.println(e);

		in.close();

	}


}
