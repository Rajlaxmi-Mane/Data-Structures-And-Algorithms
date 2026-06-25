package com.patterns;

//              * * * * * * * * * * 
//              * * * *     * * * *     
//              * * *         * * *         
//              * *             * *             
//              *                 *  

public class RightAngleCombo {
	public static void main(String[] args) throws Exception {
// ------------------------------------ OPTION 1 -----------------------------------------		
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n*2-1; j++) {
				if(i+j <= n+1 || j-i >= n-1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
//    ------------------------------------- OPTION 2 -------------------------------------		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<n+i;j++) {
//				if(i+j<=n+1) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				Thread.sleep(100);
//			}
//			
//			for(int j=1;j<n+i;j++) {
//				if(i+j<=n+1) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				Thread.sleep(100);
//			}
//			
//			System.out.println();
//		}
	}

}
