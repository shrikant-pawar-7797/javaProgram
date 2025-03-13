package BasicPrograms;

public class fibonacciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 0;
		int num = 1;
		System.out.print(a + " ,");
		System.out.print(b + " ,");

		while (num <= 10) {

			c = a + b;
			a = b;
			b = c;

			System.out.print(c+ " ,");
			num++;
		}

	}

}
