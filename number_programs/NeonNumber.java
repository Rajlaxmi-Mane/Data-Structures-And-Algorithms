package com.number_programs;

import java.util.Scanner;

public class NeonNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter range");
		int first=scanner.nextInt();
		int last=scanner.nextInt();
		
		neonBetween(first,last);
		scanner.close();
	}
	
	public static void neonBetween(int start,int last) {
		for(int num=start;num<=last;num++) {
			int square=num*num;
			int sum=0;
			while(square!=0) {
				sum+=square%10;
				square/=10;
			}
			if(num==sum)
				System.out.println(num+" ");
		}
	}

}
