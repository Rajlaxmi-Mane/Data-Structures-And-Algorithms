package com.array;

import java.util.Arrays;

public class SwapFirstHAlfWithSecondHalf {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7,8,9 };
		// first half={1,2,3,4,5}
		// second half={6,7,8,9};
		
		
		int i = 0;
		int j = arr.length / 2 + 1;
		
		
//		FOR EVEN NUMBER OF ELEMENTS
		
//		while (j < arr.length ) {
//			int temp = arr[i];
//			arr[i++] = arr[j];
//			arr[j++] = temp;
//		}
		
		
		// FOR ODD NUMBER OF ELEMENTS
		
		while (j < arr.length ) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j++] = temp;
		}
		
		j=arr.length/2+1;

		while (j < arr.length) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j++] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}

}
