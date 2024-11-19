package com.string;

public class CountAlphabet {
	public static void main(String[] args) {
		
		// 0- 48 ascii fro zero
		
		String str="Hello world @ 1245";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch>='a'  && ch<='z') || (ch>='A'&& ch<='Z' ) ) {
				
				count++;
				
			}
		}
		System.out.println(count);
	}

}
