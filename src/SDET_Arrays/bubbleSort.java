package SDET_Arrays;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		int[] arr = { 5, 2, 9, 1, 5, 6, 9, 3, 10, 4 };
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println("Sorted Array= " + Arrays.toString(arr));

	}

}
