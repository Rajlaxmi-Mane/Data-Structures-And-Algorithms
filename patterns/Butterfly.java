package com.patterns;
//

//           *        *
//           **      **
//           ***    ***
//           ****  ****
//           **********
//           ****  ****
//           ***    ***
//           **      **
//           *        *

public class Butterfly {

	public static void main(String[] args) {

		int n = 7;
// -----------------------  OPTION 1 --------------------------------

		for(int i=1; i<=n ;i++) {
			for(int j=1; j<=n; j++) {
				if((i>=j && i+j <= n+1) || (j+i >= n+1 && j>=i)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//   ------------------------------ HOLLOW BUTTERFLY ------------------------------------

//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				if (j == 1 || j == n || i + j == n + 1 || i == j) {
//					if ((i >= j && i + j <= n + 1) || (j + i >= n + 1 && j >= i)) {
//						System.out.print("* ");
//					} else {
//						System.out.print("  ");
//					}
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
// -----------------------  OPTION 2 -------------------------------- 

//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//
//			for (int j = 1; j <= ((n - i) * 2); j++) {
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}`
//
//		for (int i = n-1; i >=1; i--) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//
//			for (int j = 1; j <= ((n - i) * 2); j++) {
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

}
