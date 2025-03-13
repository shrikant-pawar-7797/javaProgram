package BasicPrograms;

public class factorial {

	public static void main(String[] args) {

		int num = 0;
		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}

		System.out.println("Factorail of given number" + fact);
	}

}
