package com.string;

// FIRST REPEATING CHARACTER IN STRING

public class FirstReatingChar {
	public static void main(String[] args) {
		String str = "DAGBAFF";
		char[] ch = str.toCharArray();
		char res = ' ' ;
		boolean flag = false;
		
		for(int i=0; i<ch.length-1; i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					flag = true;
					res = ch[i];
				}
			}
			if(flag) break;
		}
		System.out.println("First repeated char is : "+res);
	}

}
