package com.linkedlist;
import java.util.*;

public class List {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.addFirst("hello");
		list.addFirst("add first");
		list.addLast("add last"); //add();
		
		System.out.println(list);
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"->");
		}
		System.out.println("null");
		System.out.println(list.contains("hello"));
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
	}
	

}
