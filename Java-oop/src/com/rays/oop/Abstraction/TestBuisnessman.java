package com.rays.oop.Abstraction;

public class TestBuisnessman {
	public static void main(String[] args) {
		
		RichMan r = new Buisnessman();
		
		r.donation();
		r.earnmoney();
		r.party();
		
		
		SocialWorker s = new Buisnessman();
		
		s.helptoothers();
	 
		Buisnessman bs = new Buisnessman();
		bs.donation();
		bs.earnmoney();
		bs.getname();
		bs.helptoothers();
		bs.party();
	}

}
