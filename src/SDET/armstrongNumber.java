package SDET;
// Program to find Armstrong Number.
public class armstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int temp=num;
		int total = 0;
		int lastDigit;

		while (num > 0) {
			lastDigit = num % 10;
			total = total + (lastDigit * lastDigit * lastDigit);
			num/=10;

		}
		
		if(total==temp) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}

}
