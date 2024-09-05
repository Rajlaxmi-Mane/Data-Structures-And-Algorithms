package com.backtracking;

public class Permutations {
	
	public static void Permutations(String str, String combinations) {
		if(str.length()==0) {
			System.out.println(combinations);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char currentChar=str.charAt(i);
			String newStr=str.substring(0,i)+str.substring(i+1);
			Permutations(newStr,combinations+currentChar);
		}
	}
	
	public static void main(String[] args) {
		String str="abc";
		Permutations(str,"");
	}

}
