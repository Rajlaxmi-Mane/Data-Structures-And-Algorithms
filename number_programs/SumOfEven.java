package com.number_programs;

public class SumOfEven {
	
	public static void main(String[] args) {
		int num=451263;
		
		System.out.println("sum of even digit is : "+sumOfEven(num));
	}
	
	public static int sumOfEven(int num) {
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			if(rem%2==0) {
				sum+=rem;
			}
			num/=10;
		}
		return sum;
	}

}
