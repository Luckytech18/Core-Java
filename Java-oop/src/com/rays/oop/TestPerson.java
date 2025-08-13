package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
 public static void main(String[] args) throws ParseException {
	
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	 
	 Person p = new Person();
	 
	 p.setName("Lucky");
	 p.setDob(sdf.parse("2005-01-18"));
	 p.setAddress("Gwalior");
	 p.getAge();
	 
	 System.out.println("Name:"+p.getName());
	 System.out.println("Dob:"+p.getDob());
	 System.out.println("Address"+ p.getAddress());
	
			 
}
}
