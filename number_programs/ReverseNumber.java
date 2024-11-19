package com.number_programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 543210;
		System.out.println("revrese of given number " + num + " is : " + rev(num));
	}

	public static int rev(int num) {
		int rev = 0;

		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;
	}

}
