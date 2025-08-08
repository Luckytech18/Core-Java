package in.co.rays.basic;

public class Swapping {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 0;

		System.out.println(" Before Swapping");
		System.out.println("a = " + a + "   " + "b = " + b);

		c = a;
		a = b;
		b = c;

		System.out.println(" after Swapping");
		System.out.println("a = " + a + "   " + "b = " + b);

		a = a + b;// a is 15

		a = a - b; // a is 10

		b = a - b;

		System.out.println("a is " + a);
		System.out.println("b is = " + b);

	}

}
