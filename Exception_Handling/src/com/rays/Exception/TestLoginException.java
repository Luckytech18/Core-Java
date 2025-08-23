package com.rays.Exception;

public class TestLoginException {
	public static void main(String[] args) throws LoginException {

		String login = "lucky";

		if (login != null && login == "lucky") {
			System.out.println("User found sucessfully");
		} else {
			throw new LoginException();
		}
		System.out.println("Login sucessfully");
	}

}
