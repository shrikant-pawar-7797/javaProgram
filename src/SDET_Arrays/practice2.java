package SDET_Arrays;

// 10.) Find Minimum and Maximum from an Array

public class practice2 {

	public static void main(String[] args) {

		int arr[] = { 14, 5, 6, 7, 32, 54, 75, 87, 23, 43, 98 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Minimum value from an Array : " + min);

		System.out.println("Maximum value from an Array : " + max);

	}

}
