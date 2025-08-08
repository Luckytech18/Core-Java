package in.co.rays.basic;

public class Password {
	public static void main(String[] args) {

		//String Password = null;

		String Password = "Pass1234";

		if (Password == null) {

			System.out.println("Password is required");

		} else {
			if ("Pass1234".equals(Password)) {

				System.out.println("User Login Successfully");
			} else {
				System.out.println("User Loginid & Password is Incorrect");
			}
		}

	}
}
