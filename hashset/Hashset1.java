package com.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		/*
		 * Hashset is a class in collection framework to create Hashset first we have to
		 * import HashSet package
		 */
		// HashSet will not allow duplicates values
		// HashSet does not follow indexing
		// also HashSet does not maintain insertion order

		// syntaxt:
		// HashSet<Type> hname=new HashSet<>();

		HashSet<Integer> set = new HashSet<>();
		// to add elements in hashset we have to use add() method

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		System.out.println(set);

		// removing set element
		set.remove(10);
		set.remove(30);

		System.out.println(set);

		// iterator() to iterate the set

		// it will convert the set into iterator type
		Iterator i = set.iterator();

		// hasNext() is present into iterator interface
		// it will check the element is present or not in the next index

		while (i.hasNext()) {

			// next() method will return the current element and move cursor to the next
			// position

			System.out.println(i.next());
		}

		// contains() method will check the into collection that the  passed element is present or not
		// containsAll()- to check collection is present inside another collection
		// it will return boolean type of value
		System.out.println(set.contains(10));
		
		// size()- gives the size of an hashset
		
		System.out.println(set.size());
		
		// isEmpty()- return the collection is empty or not
		System.out.println(set.isEmpty());
		
		// isBlank()- return collection is blank or not
		System.out.println(set.isEmpty());
		
		// clear() is used to delete entire collection
		//set.clear();
		// the above statement will delete the entire collection
		
		
		// toArray() - will convert the collection into an array
		Object[] arr=set.toArray();
		System.out.println(Arrays.toString(arr));
	}

}
