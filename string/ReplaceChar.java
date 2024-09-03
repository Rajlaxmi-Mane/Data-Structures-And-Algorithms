package com.string;
import java.util.*;

public class ReplaceChar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=s.next();
		String res=" "; 
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)=='e') {
				res+='i';
				
			}else {
				res+=str.charAt(i);
			}
		}
		System.out.println("RESULT STRING  = "+res);
		
	}

}
