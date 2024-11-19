package com.number_programs;

public class Fibonacci {
	
	public static void main(String[] args) {
		int a=0,b=1;
		int limit=50;
		System.out.print(a+" "+b+" ");
		recursiveFibonacci(limit, a, b);
		
//		int c=0;
//		while(c<=limit) {
//			c=a+b;
//			a=b;
//			b=c;
//			System.out.print(c+" ");
//		}
	}
	
	public static void recursiveFibonacci(int limit,int a,int b) {
		int c=a+b;
		if(c>=limit) {
			return;
		}
		System.out.print(c+" ");
		recursiveFibonacci(limit, b, c);
	}

}
