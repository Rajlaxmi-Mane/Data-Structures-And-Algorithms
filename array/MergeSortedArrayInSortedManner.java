package com.array;

import java.util.Arrays;

public class MergeSortedArrayInSortedManner {
	
	public static void main(String[] args) {
		
		int arr1[]= {1,3,5,7,9,10};
		int arr2[]= {12,14,16,18};
		int res[]=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int index=0;
		
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<arr2[j])
				res[index++]=arr1[i++];
			else
				res[index++]=arr2[j++];
		}
		
		while(i<arr1.length)
			res[index++]=arr1[i++];
		
		while(j<arr2.length)
			res[index++]=arr2[j++];
		
		
		
		System.out.println(Arrays.toString(res));
	}

}
