package SDET;
// Program to find number of digits in given number.
public class numberOfDigits {

	public static void main(String[] args) {

		int num = 12345678;
		int count = 0;

		while(num>0) {
			num/=10;
			count++;
		}
		
		System.out.println("Total digits in given number "+ count);
	}

}
