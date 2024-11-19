package com.patterns;

//              * * * * * * * * * * 
//              * * * *     * * * *     
//              * * *         * * *         
//              * *             * *             
//              *                 *  

public class RightAngleCombo {
	public static void main(String[] args) throws Exception {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n+i;j++) {
				if(i+j<=n+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				Thread.sleep(100);
			}
			
			for(int j=1;j<n+i;j++) {
				if(i+j<=n+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				Thread.sleep(100);
			}
			
			System.out.println();
		}
	}

}
