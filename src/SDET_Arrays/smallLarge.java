package SDET_Arrays;

// 7.) Find the largest and smallest element in an Array

public class smallLarge {

	public static void main(String[] args) {

		int min = 0;
		int max = 0;
		int a[] = { 2, 1, 3, 4, 5, 8, 7, 6, 99, 8, 0, 3, 33, 21, 67 };

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];
			}
		}

		for (int j = 0; j < a.length; j++) {

			if (a[j] > max) {

				max = a[j];
			}

		}

		System.out.println(min);
		
		System.out.println(max);

	}

}
