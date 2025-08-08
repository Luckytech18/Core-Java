package in.co.rays.basic;

public class ElseIf {

	public static void main(String[] args) {

		String loginId = null;

		

		if (loginId == null) {

			System.out.println("loginId is req...");

		} else {
			if ("abc@gmail.com".equals(loginId)) {

				System.out.println("User  Login Successfully ");

			}else {
				
				System.out.println("your loginId is invalid..");

			}				

		}
	}
}
