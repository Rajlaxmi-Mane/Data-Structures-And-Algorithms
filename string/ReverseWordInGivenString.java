package com.string;

public class ReverseWordInGivenString {
	
	public static void main(String[] args) {
		
		String str="Apple,Ball,Cat,Dog,Elephand,Flower";
		System.out.println(str);
		String[] words=str.split(",");
		String temp="";
		for(int i=words.length-1;i>=0;i--) {
			if(i != 0)
				temp+=words[i]+",";
			else
				temp+=words[i];
		}
		System.out.println(temp);
	}

}
