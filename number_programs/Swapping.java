package com.number_programs;

public class Swapping {
	
	public static void main(String[] args) {
		int a=10,b=5;
		System.out.println("before swapping");
		System.out.println("a = "+a+" b = "+b);
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("afterd swapping");
		System.out.println("a = "+a+" b = "+b);
		System.out.println();
		
		// logic 2
		int c=10,d=5;
		System.out.println("before swapping");
		System.out.println("c = "+c+" d = "+d);
		c=c+d;
		d=c-d;
		c=c-d;
		
		System.out.println("afterd swapping");
		System.out.println("c = "+c+" d = "+d);
		System.out.println();
		
		// LOGIC : 3 USING XOR
		
		int x=10,y=5;
		System.out.println("before swapping");
		System.out.println("x = "+x+" y = "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println("afterd swapping");
		System.out.println("x = "+x+" y = "+y);
		
	}

}
