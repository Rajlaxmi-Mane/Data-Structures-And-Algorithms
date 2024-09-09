package com.Sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void conqure(int[] arr,int si,int mid,int ei) {
		
		// create one more array to store merged sorted array
		int[] marr=new int[ei-si+1];
		
		// to traverse first part of an array
		int indx1=si;
		
		//to traverse scond part of an array
		int indx2=mid+1;
		
		//to traverse marr
		int x=0;
		
		while(indx1<=mid && indx2<=ei ) {
			if(arr[indx1]<=arr[indx2]) {
				marr[x++]=arr[indx1++];
			}else {
				marr[x++]=arr[indx2++];
			}
		}
		
		// if any one of the part completed but still elements are remains in other part
		// that also we have store.
		// for that we are using another loop
		while(indx1<=mid) {
			marr[x++]=arr[indx1++];
		}
		while(indx2<=ei) {
			marr[x++]=arr[indx2++];
		}
		
		for(int i=0,j=si;i<marr.length;i++,j++) {
			arr[j]=marr[i];
		}
	}
	
	public static void divide(int[] arr,int si,int ei) {
		// si=starting index of passed array
		// ei = end index of passed array
		
		// basecase condition 
		if(si>=ei) {
			return;
		}
		
		// mid=(si+ei)/2 in some systems this statement will not work properly
		// and also it is increasing time complexity thats why instead of that we are
		// using another way
		
		int mid=si+(ei-si)/2; 
		
		// dividing in two parts
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		
		// to conqure the divided array into sorted manner call conquer()
		
		conqure(arr,si,mid,ei);
	}
	
	public static void main(String[] args) {
		int[] arr= {9,1,5,2,8,5};
		divide(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
