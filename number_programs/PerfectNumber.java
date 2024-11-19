package com.number_programs;

public class PerfectNumber {
	
	public static void main(String[] args) {
		int num=6;
		if(isPerfect(num))
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is not a perfect number");
	}
	
	public static boolean isPerfect(int num) {
		int sum=1;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				sum+=i;
		}
		return sum==num;
	}

}
