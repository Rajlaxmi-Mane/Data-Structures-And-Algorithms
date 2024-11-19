package com.number_programs;

public class Area{
	
	public static void main(String[] args) {
		int radius=3;
		int side=10;
		int height=15,base=20;
		System.out.println("area of circle is : "+circle(radius));
		System.out.println("area of square is : "+square(side));
		System.out.println("area of triangle is : "+triangle(height,base));
	}
	
	public static double circle(int radius) {
		return 3.142*radius*radius;
	}
	
	public static double square(int side) {
		return side*side;
	}
	
	public static double triangle(int h,int b) {
		return h*b/2;
	}

}
