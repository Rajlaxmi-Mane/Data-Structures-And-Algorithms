package com.array_2d;

import java.util.*;

public class SearchElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of rows");
		int row = s.nextInt();
		System.out.println("enter no of columns");
		int col = s.nextInt();
		int a[][] = new int[row][col];
		System.out.println("enter array elements :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("INPUT ARRAY IS LIKE :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("enter key element to be search");
		int key = s.nextInt();
		int t = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (a[i][j] == key) {
					t = 1;
				}
			}

		}
		if (t == 1) {
			System.out.println(key + " is present inside an array");
		} else {
			System.out.println(key + " is not present inside an array.");
		}
	}

}
