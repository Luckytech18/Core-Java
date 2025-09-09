package com.rays.io.Serialization;

import java.io.Serializable;

public class Account implements Serializable {
	
	public String accountNo;
	public Double balance;
	
	public Account(String a , double b) {
		this.accountNo = a;
		this.balance = b ;
		
	}
	
	public String toString() {
		
		return "Account[Account No:" + accountNo + ",Current Balance:" + balance+"]";
	}

}
