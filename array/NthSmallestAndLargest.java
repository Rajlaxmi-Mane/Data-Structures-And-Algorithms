package com.array;

import java.util.Arrays;

public class NthSmallestAndLargest {
	
	public static void main(String[] args) {
		
		int arr[]= {12,23,3,4,16,74,78,56};
		int n=3;
		
		Arrays.sort(arr);
		
		System.out.println(n+"rd smallest element is : "+arr[n-1]);
		System.out.println(n+"rd largest element is :"+arr[arr.length-n]);
	}

}