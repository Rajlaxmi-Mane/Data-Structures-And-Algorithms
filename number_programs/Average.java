package com.number_programs;

public class Average {
	
	public static void main(String[] args) {
		int num=12345;
		System.out.println(avg(num));
	}
	
	public static int avg(int num) {
		int cnt=0;
		int sum=0;
		while(num!=0) {
			sum+=(num%10);
			num/=10;
			cnt++;
		}
		return sum/cnt ;
	}

}
