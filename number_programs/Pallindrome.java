package com.number_programs;

public class Pallindrome {
	public static void main(String[] args) {
		int num=1221;
		if(isPallindrome(num)) {
			System.out.println(num+" is a pallindrome number");
		}else {
			System.out.println(num+" is not a pallindrome number");
		}
	}
	
	public static boolean isPallindrome(int num) {
		int temp=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+(num%10);
			num/=10;
		}
		return temp==rev;
	}

}
