package com.array;

import java.util.Arrays;

public class MergeArrayInZigZagManner {
	
	public static void main(String[] args) {
		
		int arr1[]= {1,3,5,7,9};
		int arr2[]= {2,4,6,8,10};
		
		int mergedArr[]=new int[arr1.length+arr2.length];
		
		int index=0;
		for(int i=0;i<arr1.length;i++) {
			mergedArr[index++]=arr1[i];
			mergedArr[index++]=arr2[i];
		}
		
		System.out.println(Arrays.toString(mergedArr));

	}     

}
