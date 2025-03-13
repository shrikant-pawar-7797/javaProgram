package BasicPrograms;

import java.util.Scanner;

public class pallindromeNumber {

	public static void main(String[] args) {

		// 121 is pallindrome number

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter number");

		int num = sc.nextInt();

		int temp = num;
		int lastDigit;

		int rev = 0;

		while (num > 0) {

			lastDigit = num % 10;
			rev = rev * 10 + lastDigit;
			num = num / 10;

		}

		if (rev == temp) {
			System.out.println("Pallindrome Number...!");
		} else {
			System.out.println("Not pallindrome number...!");
		}
		sc.close();

	}

}
