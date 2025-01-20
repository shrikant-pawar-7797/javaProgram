package SDET;
// Java program to reverse number.
public class reverseNumber {

	public static void main(String[] args) {

		int number = 1234567;
		int reverse = 0;

		while (number != 0) {
			int digit = number % 10; // Extract last digit
			reverse = reverse * 10 + digit; // Append to reverse
			number /= 10; // Remove last digit
		}

		System.out.println("Reversed number: " + reverse);

	}

}
