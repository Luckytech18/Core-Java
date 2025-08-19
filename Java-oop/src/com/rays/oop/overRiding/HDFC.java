package com.rays.oop.overRiding;

public class HDFC extends Bank {

	@Override
	public String getName() {

		return "HDFC";
	}

	@Override
	public double interestRate() {

		return 10.10;
	}

}
