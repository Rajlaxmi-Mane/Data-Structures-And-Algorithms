package com.array_2d;

import java.util.*;

public class Transpose {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[4][3];
		System.out.println("ENTER ARRAY EEMENTS : ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println("ORIGINAL ARRAY :");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("TRANSPOSE OF AN ARRAY :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
