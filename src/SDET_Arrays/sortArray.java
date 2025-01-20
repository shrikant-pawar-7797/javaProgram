package SDET_Arrays;

import java.util.Arrays;

// 3.) Sort an array without using in-built method

public class sortArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,6,5,4,7,87,97,5,433,232,243,656,78};
		
		Arrays.sort(arr);
		
		//System.out.println("Sorted Array: " + Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
