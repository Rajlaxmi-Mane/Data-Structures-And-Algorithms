package com.number_programs;

public class SmallestDigit {

	public static void main(String[] args) {
		int num=45263;
		System.out.println("smallest digit is : "+min(num));
	}
	
	public static int min(int num) {
		int min=num%10;
		num/=10;
		while(num!=0) {
			int rem=num%10;
			if(rem<min) {
				min=rem;
			}
			num/=10;
		}
		return min;
	}
}
