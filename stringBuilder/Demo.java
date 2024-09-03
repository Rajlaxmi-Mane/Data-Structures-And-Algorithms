package com.stringBuilder;

import java.util.*;

public class Demo {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		StringBuilder b = new StringBuilder("ARADHYA");
		System.out.println(b);
		b.append('m');
		b.insert(0, 'm');
		System.out.println(b);

	}
}
