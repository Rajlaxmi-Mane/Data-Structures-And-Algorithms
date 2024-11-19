package com.patterns;

public class Combo2 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j)
					System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<=j)
					System.out.print("* ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j && i+j<n*2+1 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
