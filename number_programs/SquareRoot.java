package com.number_programs;

public class SquareRoot {
	
	public static void main(String[] args) {
		
		int num=100;
		boolean flag=false;
		for(int i=1;i*i<=num;i++) {
			if(i*i==num) {
				flag=true;
				System.out.println(i);
				break;
			}
		}
		if(!flag)
			System.out.println(num+" is not a perfect square");
	}

}
