package SDET_Arrays;

import java.util.Scanner;

// 8.) Search element in an Array

public class searchElement {

	public static void main(String[] args) {

		int a[] = { 2, 4, 65, 76, 87, 9, 8, 75, 32, 0, 81 };

		int count = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number you want to find : ");

		int num = scanner.nextInt();

		scanner.close();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {

				count++;

			}

		}
		if (count == 1) {
			System.out.println("Your searching number is present");
		}

		else {
			System.out.println("Your searching number is not present");
		}

	}

}
