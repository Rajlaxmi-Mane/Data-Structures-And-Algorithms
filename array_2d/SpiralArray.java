package com.array_2d;

import java.util.*;

public class SpiralArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[4][4];
		System.out.println("ENTER ARRAY EEMENTS : ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println("ORIGINAL ARRAY :");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int rs=0;
		int re=4-1;
		int cs=0;
		int ce=4-1;
		System.out.println("SPIRAL ORDER IS ");
		while(rs<=re && cs<=ce) {
			for(int col=cs;col<=ce;col++) {
				System.out.print(arr[rs][col]+" ");
			}
			rs++;
			
			for(int row=rs;row<=re;row++) {
				System.out.print(arr[row][ce]+" ");
			}
			ce--;
			
			for(int col=ce;col>=cs;col--) {
				System.out.print(arr[re][col]+" ");
				
			}
			re--;
			for(int row=re;row>=rs;row--) {
				System.out.print(arr[row][cs]+" ");
			}
			cs++;
			System.out.println();
		}
	}
}
