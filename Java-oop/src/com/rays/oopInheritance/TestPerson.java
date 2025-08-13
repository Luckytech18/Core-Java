package com.rays.oopInheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {

		BuisnessMan b = new BuisnessMan();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		b.setName("Lucky");
		b.setAddress("Gwalior");
		b.setDob(sdf.parse("2005-01-18"));
		b.setIncome(2000);

		System.out.println("Name :" + b.getName());
		System.out.println("Address : " + b.getAddress());
		System.out.println("Date:" + sdf.format(b.getDob()));
		System.out.println("Income" + b.getIncome());

		System.out.println("-------doctor-----------");

		Doctor d = new Doctor();

		d.setName("Anshit");
		d.setAddress("Indore");
		d.setDob(sdf.parse("2002-01-18"));
		d.setRegistrationNo("21");
		
		System.out.println("Name :" + d.getName());
		System.out.println("Address : " + d.getAddress());
		System.out.println("Date:" + sdf.format(d.getDob()));
		System.out.println("Registration :" + d.getRegistrationNo());
		
		System.out.println("----------Student---------");
		
		Student s = new Student();
		
		s.setName("Jayesh");
		s.setDob(sdf.parse("2003-02-03"));
		s.setAddress("Gwalior");
		s.setMarks(55);
		s.setRollno("44");
		
		System.out.println("Name :" + s.getName());
		System.out.println("Address : " + s.getAddress());
		System.out.println("Date:" + sdf.format(s.getDob()));
		System.out.println("Roll no:" + s.getRollno());
		System.out.println("Marks:"+ s.getMarks());
		
		
		
		
		
		
		
		
		


	}
}
