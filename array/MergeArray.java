package com.array;

import java.util.Arrays;

public class MergeArray {
	
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		
		int mergedArr[]=new int[arr1.length+arr2.length];
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int k=0;
		for(int i=0;i<arr1.length;i++)
			mergedArr[k++]=arr1[i];
		
		for(int j=0;j<arr2.length;j++)
			mergedArr[k++]=arr2[j];
		
		
		System.out.println(Arrays.toString(mergedArr));
	}

}
