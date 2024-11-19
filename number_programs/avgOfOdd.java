package com.number_programs;

public class avgOfOdd {
	
	public static void main(String[] args) {
		int num=451263;
		System.out.println(avgOfOdd(num));
	}
	
	public static float avgOfOdd(int num) {
		int sum=0,cnt=0;
		while(num!=0) {
			int rem=num%10;
			if(rem%2!=0) {
				sum+=rem;
				cnt++;
			}
			num/=10;
		}
		return sum/cnt;
	}

}
