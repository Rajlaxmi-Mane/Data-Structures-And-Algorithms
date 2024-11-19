package com.array;

public class CountPrimeNumFromArray {
	
	public static void main(String[] args) {
		
		int [] arr= {1,13,41,32,45,67,98};
		int count=0;
		
		for(int i=1;i<arr.length;i++) {
			int num=arr[i];
			boolean isPrime=true;
			
			for(int f=2;f<=num/2;f++) {
				if(num%f==0) {
					isPrime=false;
					break;
				}
			}
			
			if(isPrime)
				count++;
		}
		System.out.println(count );
	}

}
