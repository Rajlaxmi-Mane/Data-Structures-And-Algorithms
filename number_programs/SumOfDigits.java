package com.number_programs;

public class SumOfDigits {
	
	public static void main(String[] args) {
		int num=12345;
		System.out.println("sum of digits is : "+sum(num));
	}
	
	public static int sum(int num) {
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		return sum;
	}

}
