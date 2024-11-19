package com.string;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		String str="hello World@ 1245";
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch<='9' && ch>='0') {
				sum+=(ch-48);
			}
		}
		System.out.println(sum);
	}

}
