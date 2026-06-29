package com.string;

// FIND MIN AND MAX FREQUENCY OF CHAR

public class MinMaxFrequencyOfChar {
	public static void main(String[] args) {
		String str = "AABBCDDD";
		int max=0;
		int min=str.length();
		char ch =' ';
		char minch =' ';
		
		for(int i=0; i<str.length();i++) {
			int res = 0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					res++;
				}
			}
			if(res > max) {
				max = res;
				ch = str.charAt(i);
			}
			if(res < min) {
				min = res;
				minch = str.charAt(i);
			}
		}
		System.out.println(ch + " have max frequecy");
		System.out.println(minch + " have min frequecy");
	}

}
