package com.number_programs;

public class SumOfFactors {
	
	public static void main(String[] args) {
		int num=10;
		System.out.println(sumOfFactors(num));
	}
	
	public static int sumOfFactors(int num) {
		int sum=num;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				sum+=i;
		}
		return sum;
	}

}
