package com.number_programs;

public class Factorial {
	
	public static void main(String[] args) {
		int num=5;
		System.out.println(fact(num));
		System.out.println(recursiveFact(num));
	}
	
	public static int fact(int num) {
		int fact =num;
		for(int i=1;i<num;i++) {
			fact*=i;
		}
		return fact;
	}
	
	//RECURSIVE METHOD TO RETURN THE FACTORIAL
	
	public static int recursiveFact(int num) {
		if(num==1) 
			return 1;
		return num*recursiveFact(num-1);
	}

}
