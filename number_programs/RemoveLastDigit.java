package com.number_programs;

public class RemoveLastDigit {
	
	public static void main(String[] args) {
		int num=6545;
		System.out.println("number after removing last digit : "+removeLast(num));
	}
	
	public static int removeLast(int num) {
		return num/10;
	}

}
