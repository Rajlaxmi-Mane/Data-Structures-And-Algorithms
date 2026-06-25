package com.patterns;

//
//				1 
//			  A B C 
//			2 3 4 5 6 
//		  D E F G H I J 


public class AlphaNumPiramid {
	
	public static void main(String[] args) {
//     ----------------------------- OPTION 1 ----------------------------------
		
//		int n=4;
//		int cnt=1;
//		char ch='A';
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<n+i;j++) {
//				if(i+j>n) {
//					if(i%2==0)
//						System.out.print(ch++ +" ");
//					else
//						System.out.print(cnt++ +" ");
//				}
//
//				else
//					System.out.print("  ");
//				
//			}
//			System.out.println();
//		}
		
//	     ----------------------------- OPTION 2 ----------------------------------
		
		int n=4;
		int num=1;
		char ch = 'A';
		
		for(int i=1; i<=n; i++) { 
			System.out.print("   ");
			for(int j=1; j<=n*2-1; j++) {
				if(i+j > n && j-i < n) { 
					if(i%2 == 0) {
						System.out.print(ch++ + " ");
					} else {
						System.out.print(num++ + " ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
