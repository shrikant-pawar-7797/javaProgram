package SDET_Arrays;

// 11.) Java program to count Odd and
// Even number from given array
// Input: {1,2,3,4,5,6,7,8,9}

public class practice3 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int evenCount = 0;
		int oddCount;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				evenCount++;
			}

		}

		oddCount = arr.length - evenCount;

		System.out.println("Total numbers in an Array : " + arr.length);

		System.out.println("Total Even numbers in given array : " + evenCount);

		System.out.println("Total Odd numbers in given array : " + oddCount);

	}

}
