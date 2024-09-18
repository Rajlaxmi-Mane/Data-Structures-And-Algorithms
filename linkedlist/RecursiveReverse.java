package com.linkedlist;

import com.linkedlist.ReverseList.node;

public class RecursiveReverse {
	node head=null;
	private int size;
	
	RecursiveReverse(){
		this.size=0;
	}
	
	//linked list is created

	class node {
		int data;
		node next;
		
		node(int data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	
	//add-first , last element
	public void addfirst(int data) {
		node newNode=new node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void addLast(int data) {
		node newNode=new node(data);
		if(head==null) {
			newNode.next=head;
			head=newNode;
			return;
		}
		
		node curNode=head;
		while(curNode.next != null) {
			curNode=curNode.next;
		}
		curNode.next=newNode;
	}
	
	
	// print list
	
	public void printList() {
		node curNode=head;
		
		if(head==null) {
			System.out.println("list is empty...");
		}
		
		while(curNode!=null) {
			System.out.print(curNode.data+"->");
			curNode=curNode.next;
		}
		System.out.println("null");
		
	}
	
	
	public void deleteFirst() {
		
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		head=head.next;
	}
	
	public void deleteLast() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		
		if(head.next==null) {
			head=null;
			return;
		}
		
		node secondLast=head;
		node lastNode=head.next;
		while(lastNode.next!=null) {
			lastNode=lastNode.next;
			secondLast=secondLast.next;
			
		}
		secondLast.next=null;
	}
	
	
	// Reverse Linked list
	
	public node recursiveReverse(node head) {
		
		if(head==null || head.next==null) {
			return head;
		}
		node newNode=recursiveReverse(head.next);
		head.next.next=head;
		head.next=null;
		return newNode;
		
	}
	
	public int getSize() {
		return size;
	}
	
	
	public static void main(String[] args) {
		RecursiveReverse list=new RecursiveReverse();
		list.addfirst(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.printList();
		
		list.head=list.recursiveReverse(list.head);
		
		list.printList();
		
	}



}
