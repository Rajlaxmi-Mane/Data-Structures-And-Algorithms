package com.linkedlist;

import com.linkedlist.createList.node;

public class ReverseList {
	node head=null;
	private int size;
	
	ReverseList(){
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
	
	public void reverse() {
		if(head==null || head.next==null) {
			return;
		}
		
		node previous=head;
		node current=head.next;
		
		while(current!=null) {
			node next=current.next;
			current.next=previous;
			
			previous=current;
			current=next;
		}
		
		head.next=null;
		head=previous;
	}
	
	public int getSize() {
		return size;
	}
	
	
	public static void main(String[] args) {
		ReverseList list=new ReverseList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.printList();
		
		list.reverse();
		
		list.printList();
		
	}


}
