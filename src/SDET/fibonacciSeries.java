package SDET;

// Java program to find Fibonacci series upto a given number range.

public class fibonacciSeries {

	public static void main(String[] args) {
		int n = 10;
		int num1 = 0;
		int num2 = 1;
		int num3;
		for (int i = 1; i <= n; i++) {
			num3 = num1 + num2;
			System.out.print(num1 + " ,");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;

		}

	}

}
