package com.number_programs;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int num=370;   // 153  // 370 // 371 // 407 
		if(isArmstrong(num))
			System.out.println(num+" is a armstrong number");
		else
			System.out.println(num+" is not a armstrong number");

	}
	
	public static boolean isArmstrong(int num) {
		int temp=num;
		int sum=0;
		int pow=power(num);
		while(num!=0) {
			int rem=num%10;
			sum+=Math.pow(rem, pow);
			num/=10;
		}
		return sum==temp;
	}
	
	public static int power(int num) {
		int cnt=0;
		while(num!=0) {
			cnt++;
			num/=10;
		}
		return cnt;
	}
}
