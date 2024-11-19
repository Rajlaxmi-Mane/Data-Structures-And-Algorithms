package com.series;

//    1,3,7,13,21,31,43,51,...

public class Series1 {
	
	public static void main(String[] args) {
		int el=1;
		int incr=2;
		int count=10;
		
		System.out.print(el+", ");
		while(count>1) {
			el+=incr;
			System.out.print(el+", ");
			incr+=2;
			count--;	
		}
		
		
	}

}
