package com.number_programs;

public class XylemAndPhloemNumber {
	
	public static void main(String[] args) {
		int num=22123;

		if(isXylemWay2(num))
			System.out.println(num+" is a Xylem number");
		else
			System.out.println(num+" is a Phloem number");
		
	}

	public static boolean isXylemWay2(int num) {
		int outerSum=num%10;
		int innerSum=0;
		num/=10;
		
		while(num>9) {
			innerSum+=num%10;
			num/=10;
		}
		
		outerSum+=num;
		
		return innerSum==outerSum;
	}
	
	

//	public static int getFirst(int num) {
//		int rem=0;
//		while(num !=0) {
//			rem=num%10;
//			num/=10;
//		}
//		return rem;
//	}
//	
//	public static boolean isXylem(int num) {
//		int sum=0;
//		int last=num%10;
//		int first=getFirst(num);
//		while(num!=0) {
//			sum+=num%10;
//			num/=10;
//		}
//		int sumOfFirstAndLAst=first+last;
//		int sumOfReamaining=sum-sumOfFirstAndLAst;
//		
//		return sumOfFirstAndLAst==sumOfReamaining;
//	}
//	

}
