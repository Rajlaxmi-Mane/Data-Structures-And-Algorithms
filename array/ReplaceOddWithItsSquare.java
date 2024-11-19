package com.array;

import java.util.Arrays;

public class ReplaceOddWithItsSquare {
	
	
	public static void main(String[] args) {
		
		int arr[]= {12,13,23,2,22,45,76};
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1){
				arr[i]*=arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
