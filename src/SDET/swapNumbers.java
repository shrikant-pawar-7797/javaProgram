package SDET;

// Java program to swap two numbers without using third variable.

public class swapNumbers {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);

	}

}
