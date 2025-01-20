package SDET;

import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number :");
		int number = scanner.nextInt();

		System.out.println("Given number is :" + number);

		scanner.close();
	}

}
