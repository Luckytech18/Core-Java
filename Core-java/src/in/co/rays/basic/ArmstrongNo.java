package in.co.rays.basic;

public class ArmstrongNo {
	public static void main(String[] args) {
		int i = 153;
		int temp = i;
		int r = 0;
		int sum = 0;

      while (temp > 0) {

			r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;
		}
		if (i == sum) {

			System.out.println(" It is a armstrong no.");

		} else {
			System.out.println("It is not an armstrong no");

		}

	}

}
