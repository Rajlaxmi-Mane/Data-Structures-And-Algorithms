package com.patterns;

public class CharNum {
	public static void main(String[] args) {
		String str="a5b2c3";
		System.out.println((int)'z');
		for(int i=0;i<str.length();i++) {
			String nums="";
			char ch=' ';
			if(str.charAt(i)>=65 && str.charAt(i)<=122) {
				nums+=nums.charAt(i);
			}else {
				ch=str.charAt(i);
				continue;
			}
			int num=Integer.parseInt(nums);
			for(int in=0;in<num;in++) {
				System.out.print(ch);
			}
		}
	}

}
