package com.string;

public class CountVowels {
	
	public static void main(String[] args) {
		
		String str="java PrOgrAmming";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' ||ch=='A' ||ch=='e' ||ch=='E' ||ch=='i' ||ch=='I' ||ch=='o' ||ch=='O' ||ch=='u' ||ch=='U') {
				count++;
			}
		}
		System.out.println(count);
	}

}
