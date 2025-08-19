package com.rays.oop.overRiding;

public class ICICI extends Bank {
	@Override
	public String getName() {
		
		return "ICICI";
	}
	@Override
	public double interestRate() {
		
		return 20.20;
	}

}
