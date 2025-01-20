package SDET;
// Java program to find Pallindrome number.
public class pallindromeNUmber {

	public static void main(String[] args) {

		int num = 121;
		int temp = num;
		int lastDigit, rev = 0;

		while (num > 0) {
			lastDigit = num % 10;
			rev = rev * 10 + lastDigit;
			num /= 10;
		}

		if (rev == temp) {
			System.out.println("Pallindrome Number");
		} else {
			System.out.println("Not Pallindrome number");
		}
	}

}
