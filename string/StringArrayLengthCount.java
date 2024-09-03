package com.string;

import java.util.Scanner;
public class StringArrayLengthCount {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter Araay Size :");
		int size=s.nextInt();
		int length=0;
		String [] str=new String[size];
		System.out.println(" enter array elements : ");
		for (int i=0;i<size;i++) {
			str[i]=s.nextLine();
			length+=str[i].length();
			
		}
		System.out.println("TOTAL LENGHT IS :"+length);
	}


}
