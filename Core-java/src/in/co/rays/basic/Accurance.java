package in.co.rays.basic;

public class Accurance {

	public static void main(String[] args) {
		String name = "raman";
		int count = 0;

		for (char c = 'A'; c <= 'Z'; c++) {
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == c) {
					count++;

				}

			}

			if (count > 0) {
				System.out.println(c + "=" + count);
				count = 0;

			}
		}
	}
}