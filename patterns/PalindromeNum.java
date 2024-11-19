package com.patterns;
//
//          1
//         121
//        12321
//       1234321
//      123454321



public class PalindromeNum {

	public static void main(String[] args) {
		int n = 4;

		for (int i = 1; i <=n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
	
			for(int k=i-1;k>=1;k--){
				System.out.print(k);
			}
			
			System.out.println();
		}
	}

}
