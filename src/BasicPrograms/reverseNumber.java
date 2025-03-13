package BasicPrograms;

public class reverseNumber {

	public static void main(String[] args) {

		int num = 1234567;
		int lastDigit = 0;
		int reverse = 0;

		while (num > 0) {
			lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;

		}
		
		System.out.println("Reverse number is " + reverse);

	}

}
