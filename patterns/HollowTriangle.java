package com.patterns;
//
//            * 
//          *   * 
//        *       * 
//      * * * * * * * 

public class HollowTriangle {
	
	public static void main(String[] args) {
		int n=4;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=2*i-1;j++) {
				if(j==1 || j==2*i-1 || i==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n+i;j++) {
				if(i==n || j+i==n+1 || j-i==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
