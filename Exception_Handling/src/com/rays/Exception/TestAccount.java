package com.rays.Exception;

public class TestAccount {
	public static void main(String[] args) throws InsufficientBalanceException {
		double balance = 1000.0;
		double withdraw = 1000.0;

		if (withdraw > balance) {
			// System.out.println("Insufficient Fund");
			throw new InsufficientBalanceException();
		} else {
			balance = balance - withdraw;
			System.out.println(balance);
			System.out.println("Transaction complete");

		}
	}

}
