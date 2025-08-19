package com.rays.oop.overRiding;

public class TestHomeLoan {
public static void main(String[] args) {
	
	 Bank b1 = new HDFC();
	 
	 System.out.println("-----HDFC------");
	 
	 System.out.println(b1.getName());
	 System.out.println(b1.interestRate());
	 System.out.println();
	 
	 Bank b2 = new ICICI();
	 
	 System.out.println("-----ICICI-------");
	 
	 
	 System.out.println(b2.getName());
	 System.out.println(b2.interestRate());
	 System.out.println();

	 
	 Bank b3 = new Axis ();
	 
	 System.out.println("-----Axis------");
	 
	 
	 System.out.println(b3.getName());
	 System.out.println(b3.interestRate());
	 System.out.println();
}


}
