package com.rays.oop.Abstraction;

public class Buisnessman extends Person implements RichMan, SocialWorker {
	@Override
	public void helptoothers() {
		System.out.println("help to other");

	}

	@Override
	public void donation() {
		System.out.println("Give donation");
	}

	@Override
	public void party() {
		System.out.println("Let's party");
	}

	@Override
	public void earnmoney() {
		System.out.println("Earn Money");

	}

	@Override
	public String getname() {
	
		return "Lucky";
	}

}
