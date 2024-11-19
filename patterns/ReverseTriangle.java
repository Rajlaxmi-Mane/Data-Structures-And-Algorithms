package com.patterns;

//             * * * * * * * * * 
//              * * * * * * * 
//                * * * * * 
//                  * * * 
//                    * 

public class ReverseTriangle {
	
	public static void main(String[] args) {
		int n=5;
		
		for(int i=n;i>0;i--) {
			
			
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		// one more way
		
		for(int i=n;i>0;i--) {
			for(int j=0;j<n+i;j++) {
				if(i+j>n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
