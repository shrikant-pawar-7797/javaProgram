package patterns;

public class pattern8 {

	public static void main(String[] args) {
		int n = 5;
		int num = 6;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1) || j == (n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(num - j);
				}
			}
			System.out.println();
			num--;
		}
	}

}
