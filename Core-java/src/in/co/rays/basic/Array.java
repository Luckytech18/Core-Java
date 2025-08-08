package in.co.rays.basic;

public class Array {

	public static void main(String[] args) {
		int[] a = { 7, 29, 18, 45, 17, 33 };

		int largest = a[0];
		for (int b : a) {
			if (b > largest) {
				largest = b;
			}
		}

		System.out.println(largest);

		int seclargest = a[0];

		for (int b : a) {
			if (b < largest && b > seclargest) {
				seclargest = b;

			}
		}
		System.out.println(seclargest);

	}

}
