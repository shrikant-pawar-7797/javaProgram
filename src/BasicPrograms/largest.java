package BasicPrograms;

//4. Find the Largest of Three Numbers using Ternary operator.

public class largest {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

		int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println("Largest Number is " + largest);
	}

}
