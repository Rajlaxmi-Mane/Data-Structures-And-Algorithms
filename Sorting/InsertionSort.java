package com.Sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int [] arr= {8,2,9,4,1,7,6};
		
		
		//ascending order
		for(int i=0;i<arr.length;i++) {
			int key=arr[i];
			for(int j=i-1;j>=0;j--) {
				if(key<arr[j]) {
					arr[j+1]=arr[j];
					arr[j]=key;
				}
			}
			
			
		}
		System.out.println(Arrays.toString(arr));
		
		//descending order
				for(int i=0;i<arr.length;i++) {
					int key=arr[i];
					for(int j=i-1;j>=0;j--) {
						if(key>arr[j]) {
							arr[j+1]=arr[j];
							arr[j]=key;
						}
					}
					
					
				}
				System.out.println(Arrays.toString(arr));
	}

}
