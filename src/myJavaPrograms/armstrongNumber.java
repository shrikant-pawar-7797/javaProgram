package myJavaPrograms;

public class armstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int orgNum = num;
		int temp;
		int cube;

		int sum = 0;

		while (num > 0) {
			temp = num % 10;
			cube = temp * temp * temp;
			sum += cube;
			num /= 10;
		}

		if (sum == orgNum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}

}
