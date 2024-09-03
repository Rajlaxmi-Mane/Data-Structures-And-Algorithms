package com.string;
import java.util.*;
public class First {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter firstname: ");
		String fn=s.next();
		System.out.println("enter last name :");
		String ln=s.next();
		String fln=fn+ " "+ln;
		System.out.println(fln);
		System.out.println(fln.length());
		System.out.println(fln.charAt(2));
		System.out.println(fln.substring(1,6));
		if(fn.compareTo(ln)==0) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("not equal ");
		}
		String str="123456789";
		int num=Integer.parseInt(str);
		System.out.println(num);
		int a=num+num;
		System.out.println(a);
		String st=Integer.toString(a);
		System.out.println(st);
		System.out.println(st+43);
		
	}

}
