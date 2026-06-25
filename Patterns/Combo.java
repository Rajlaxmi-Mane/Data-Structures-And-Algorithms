package com.patterns;

//                   *               * 
//                   * *           * * 
//                   * * *       * * * 
//                   * * * *   * * * * 
//                   * * * * * * * * *

public class Combo {

	public static void main(String[] args) {
		int n = 5;
//   -------------------------------------- OPTION 1 -----------------------------------

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (i >= j || i + j >= n * 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

// -------------------------------------- HOLLOW -----------------------------------

//		*               * 
//		* *           * * 
//		*   *       *   * 
//		*     *   *     * 
//		* * * * * * * * * 
		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n * 2 - 1; j++) {
//				if (j == 1 || j == n * 2 - 1 || j == i || i == n || i + j == n * 2) {
//					if (i >= j || i + j >= n * 2) {
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

//   -------------------------------------- OPTION 2 ------------------------------------

//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i>=j)
//					System.out.print("* ");
//				else
//					System.out.print("  ");
//			}
//			
//			for(int j=1;j<=n;j++) {
//				if(i+j>=n+1)
//					System.out.print("* ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
	}
}
