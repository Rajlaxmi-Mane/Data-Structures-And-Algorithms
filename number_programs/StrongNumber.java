package com.number_programs;

public class StrongNumber {
	
	public static void main(String[] args) {
		int num=145;
		if(isStrong(num))
			System.out.println(num+" is a strong number");
		else
			System.out.println(num+" is not a strong number");
	}
	
	
	public static boolean isStrong(int num) {
		int sum=0;
		int temp=num;
		
		while(num!=0) {
			int rem=num%10;
			int fact=1;
			for(int i=2;i<=rem;i++)
				fact*=i;
			sum+=fact;
			num/=10;
		}
		return temp==sum;
	}

}
