package com.number_programs;

public class ExtractLastDigit {
	public static void main(String[] args) {
		int num=12345;
		System.out.println("last digit is : "+lastDigit(num));
	}
	
	public static int lastDigit(int num) {
		return num%10;
	}

}
