package com.rays.thread;

public class Account {

	public double balance;

	public double getBalance() throws Exception {
		Thread.sleep(200);
		return balance;
	}

	public void setBalance(double balance) throws Exception {
		Thread.sleep(200);
		this.balance = balance;
	}

	public synchronized void deposit(String name, double amount) throws Exception {

		double bal = getBalance();
		bal = bal + amount;
		setBalance(bal);
		System.out.println(name + " new balance " + getBalance());

	}

}
