package SDET;
// Java program to find Prime Number.
public class primeNumber {

	public static void main(String[] args) {

		int num = 7;
		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				count++;
			}

		}

		if (count == 2) {
			System.out.println("Number is Prime number.");
		} else {
			System.out.println("Number is not prime number.");
		}

	}

}
