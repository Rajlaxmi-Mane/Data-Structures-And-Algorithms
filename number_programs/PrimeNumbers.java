package com.number_programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter range ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		primeBetween(n, m);
		scanner.close();
	}

	public static void primeBetween(int n, int m) {
		boolean flag = true;
		int cnt = 0;
		for (int num = n; num <= m; num++) {
			if(num==1 || num==0)
				continue;
			flag = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				cnt++;
				System.out.print(num + " , ");
			}
		}
		System.out.println();
		System.out.println("count = " + cnt);
	}

}
