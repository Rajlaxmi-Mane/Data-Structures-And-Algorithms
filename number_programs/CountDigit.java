package com.number_programs;

public class CountDigit {
	
	public static void main(String[] args) {
		int num=16735;
		System.out.println("Count of digit is number " +num +" is : " +countDig(num));
	}
	
	public static int countDig(int num) {
		int cnt=0;
		while(num!=0) {
			num=num/10;
			cnt++;
		}
		return cnt;
	}

}
