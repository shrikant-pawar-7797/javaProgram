package SDET_Arrays;

// 2.) Find first and last element of Arraylist.

public class firstAndLastElement {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 87, 67, 54, 32, 4, 323, 45 };

		for (int i = 0; i < arr.length; i++) {

			if ((i == 0) || (i == arr.length - 1)) {

				System.out.println(arr[i]);
			}

		}

	}
}
