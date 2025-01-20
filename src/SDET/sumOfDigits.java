package SDET;

// Java program to calculate the sum of digits of a number.
public class sumOfDigits {

	public static void main(String[] args) {

		int num = 123456;
		int sum = 0;
		int lastDigit;

		while (num > 0) {
			lastDigit = num % 10;
			sum += lastDigit;
			num /= 10;
		}

		System.out.println("sum of digits of given number is " + sum);

	}

}
