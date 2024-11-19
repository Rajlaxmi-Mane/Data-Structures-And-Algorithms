package com.string;

public class CountCharFromEacWordInString {
	
	public static void main(String[] args) {
		
		String str="Apple,Ball,Cat,Dog,Elephant,Flower";
		String words[]=str.split(",");
		
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			System.out.println(word+" = "+word.length());
		}
		
	}

}
