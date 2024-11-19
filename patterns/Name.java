package com.patterns;

public class Name {
	public static void main(String[] args) {
		int n=5;
		
		//outer for loop
		for(int i=0;i<n;i++) {
			System.out.print("*");
			
			// inner for loop for M
			for(int j=0;j<n;j++) {
				if(i==j && i<=n/2) {
					System.out.print("*");
				}else if(i+j==n-1 && i<=n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("*");
			
			// spae between M and A
			System.out.print("  ");
			
			
			// inner for loop for A
			
			for(int j=0;j<n;j++) {
				if(i==0 && j>0&& j<n-1) {
					System.out.print("*");
				}else if(i>0 && (j==0 || j==n-1)) {
					System.out.print("*");
				}else if(i==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			// space between A and T
			System.out.print("  ");
			
			
			
			// inner For loop for I
			
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1) {
					System.out.print("*");
				}else if(j==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			// space between  I and T
			System.out.print("  ");
			
			
			// inner for loop for T
			for(int j=0;j<n;j++) {
				if(i==0) {
					System.out.print("*");
				}else if(j==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			// space between T and H
			System.out.print("  ");
			
			
			// inner for loop for H
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1) {
					System.out.print("*");
				}else if(i==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			// space between H and I
			System.out.print("  ");
			
			
			// inner for loop for I
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1) {
					System.out.print("*");
				}else if(j==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			// space between I and L
			System.out.print("  ");
			
			
			//inner for loop for L
			for(int j=0;j<n;j++) {
				if(j==0) {
					System.out.print("*");
				}else if(i==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			// space between L and I
			System.out.print("  ");
			
			
			// inner for loop for I
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1) {
					System.out.print("*");
				}else if(j==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
