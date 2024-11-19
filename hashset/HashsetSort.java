package com.hashset;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class HashsetSort {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		set.add(50);
		set.add(20);
		set.add(70);
		set.add(30);
		set.add(90);
		
		// we cannot sort the set directly first we have to convert it into list
		
		ArrayList<Integer> list= new ArrayList<>(set);
		System.out.println(list);
		
		// Collections is a class which has sort() method
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
