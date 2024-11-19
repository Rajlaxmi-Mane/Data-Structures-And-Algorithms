package com.number_programs;

public class FactorsOfNumber {
	
	public static void main(String[] args) {
		int num=10;
		factors(num);
	}
	
	public static void factors(int num) {
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i+" is a factor of "+num);
			}
		}
		System.out.println(num+" is a factor of "+num);
	}

}
