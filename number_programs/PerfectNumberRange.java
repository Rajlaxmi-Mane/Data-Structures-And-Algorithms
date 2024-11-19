package com.number_programs;

import java.util.Scanner;

public class PerfectNumberRange {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter range");
		int start=scanner.nextInt();
		int last=scanner.nextInt();
		
		perfectNumbersBetween(start,last);
	}
	
	public static void perfectNumbersBetween(int start,int last) {
		
		for(int num=start;num<=last;num++) {
			int temp=num;
			int sum=1;
			
			for(int i=2;i<=num/2;i++) {
				if(num%i==0)
					sum+=i;	
			}
			if(sum==temp)
				System.out.println(temp);
		}
		
	}
}
