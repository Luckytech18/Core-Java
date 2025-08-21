package com.rays.oop.Incapsulation;

public class TestAccount {

	public static void main(String[] args) {
		 
		Account a = new Account();
		
		a.setAccNumber("123456789");
		a.setAccType("saving");
		a.setBalance(10000.0);
		
		System.out.println("account no: " + a.getAccNumber());
		System.out.println("account type: " + a.getAcctype());
		System.out.println("account balance:" + a.getBalance());
		
		a.deposit(100.0);
		a.withdrawal(9000.0);
		
		
		System.out.println("-------------------------------------");
		
		Account a1 = new Account();
		
		a1.setAccNumber("6555826684");
		a1.setAccType("current");
		a1.setBalance(25000.5);
		
		
		System.out.println("account no: " + a1.getAccNumber());
		System.out.println("account type: " + a1.getAcctype());
		System.out.println("account balance:" + a1.getBalance());
		
		a1.deposit(500.0);
		a1.withdrawal(60000);
		
		
	}
	
	
}
