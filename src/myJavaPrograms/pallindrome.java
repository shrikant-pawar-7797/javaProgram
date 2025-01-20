package myJavaPrograms;

public class pallindrome {

	public static void main(String[] args) {

		int num1 = 189081;
		int temp = num1;

		int num2, revNumber = 0;

		while (num1 > 0) {
			num2 = num1 % 10; // Extract last digit
			revNumber = revNumber * 10 + num2; // Build Reserved number
			num1 = num1 / 10;    // Remove last digit

		}

		if (revNumber == temp) {
			System.out.println(temp + " is Pallindrome Number.");
		}

		else {
			System.out.println(temp + " is Not Pallindrome number.");
		}
	}

}
