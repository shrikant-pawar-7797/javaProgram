package patterns;

public class pattern9 {

	public static void main(String[] args) {
		int n = 5;
		int num = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j < n) {
					System.out.print(num - j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			num = num - 1;
		}
	}

}
