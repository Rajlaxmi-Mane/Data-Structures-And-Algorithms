package com.patterns;

//                   A B C D E 
//                     F G H I 
//                       J K L 
//                         M N 
//                           O 

public class AlphaPattern {
	
	public static void main(String[] args) {
		int n=5;
		char ch='A';
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<=j) {
					System.out.print(ch++ +" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
