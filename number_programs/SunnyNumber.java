package com.number_programs;

public class SunnyNumber {
	
	public static void main(String[] args) {
		int num=10;
		if(isSunny(num))
			System.out.println(num+" ia a sunny number");
		else
			System.out.println(num+" is not a sunny number");
	}
	
	public static boolean isSunny(int n) {
		boolean flag=false;;
		int num=n+1;
		int res=0;
		for(int i=1;res<=num;i++) {
			if((res=i*i)==num) {
				flag=true;
				break;
			}
			
		}
		return flag;
	}

}
