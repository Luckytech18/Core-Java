package com.rays.thread;

public class AccountThread extends Thread {

	static Account a = new Account();

	public String name;

	public AccountThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				a.deposit(name, 2000.0);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
