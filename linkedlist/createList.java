package com.linkedlist;

public class createList {
	
	node head=null;
	private int size;
	
	createList(){
		this.size=0;
	}
	
	//linked list is created

	class node {
		String data;
		node next;
		
		node(String data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	
	//add-first , last element
	public void addfirst(String data) {
		node newNode=new node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void addLast(String data) {
		node newNode=new node(data);
		if(head==null) {
			newNode.next=head;
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
	
	public int getSize() {
		return size;
	}
	
	
	public static void main(String[] args) {
		createList list=new createList();
		list.addfirst("frist");
		list.addLast("prog");
		list.addLast("of linked list");
		list.addfirst("java");
		
		list.printList();
		
		System.out.println(list.getSize());
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
		System.out.println(list.getSize());
		
	}

}
