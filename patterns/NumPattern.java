package com.patterns;

//          1 
//          2 3 
//          4 5 6 
//          7 8 9 10 
//			11 12 13 14 15

public class NumPattern {
	
	public static void main(String[] args) {
		int n=5;
		int cnt=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(cnt+++" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// LOGIC 2 USING IF ELSE
		
		cnt=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i)
					System.out.print(cnt+++" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
