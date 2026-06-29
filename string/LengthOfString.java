package com.string;

// find length of a string without using length()

public class LengthOfString {
	public static void main(String[] args) {
		String str = "MAITHILI";
		int count = 0;
		 while(!str.equals("")) {
			 str = str.substring(1);
			 count++; 
		 }
		 System.out.println(count);
	}
}
