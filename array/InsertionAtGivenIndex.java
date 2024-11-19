package com.array;

import java.util.Arrays;

public class InsertionAtGivenIndex {
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40};
		int temp[]=new int[arr.length+1];
		int index=3;
		int el=35;
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
			temp[i]=arr[i];
		
		for(int i=temp.length-1;i>index;i--)
			temp[i]=temp[i-1];
		
		temp[index]=el;
		
		arr=temp;
		
		System.out.println(Arrays.toString(arr));
		
	}

}
