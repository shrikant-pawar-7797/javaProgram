package BasicPrograms;

import java.util.Scanner;

// 3. Check if a Number is Even or Odd

public class oddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number...!");

		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}

		sc.close();

	}

}
