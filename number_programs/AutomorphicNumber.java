package com.number_programs;

// if the last digit of original number is equal to the last digit of its square

public class AutomorphicNumber {
	
	public static void main(String[] args) {
		
		int num=25;
		int temp=num;
		int square=num*num;
		boolean flag=true;
		while(num!=0) {
			if(num%10==square%10) {
				num/=10;
				square/=10;
			}else {
				flag=false;
				break;
			}
		}
		
		if(flag)
			System.out.println(temp+" is a Automorphic number");
		else
			System.out.println(temp+" is not a Automorphic number");
	}

}
