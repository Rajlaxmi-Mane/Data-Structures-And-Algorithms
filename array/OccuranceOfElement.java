package com.array;

import java.util.HashSet;
import java.util.Set;

public class OccuranceOfElement {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 2, 6, 3, 2, 4, 9, 1 };
		int count = 0;
		Set set = new HashSet();

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			if (!set.contains(arr[i])) {
				set.add(arr[i]);
				for (int j = i; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
				System.out.println(arr[i] + " = " + count);

			}


		}
	}

}
