package com.linkedlist;


public class Search_And_Delete_nthEl {
	
	node head=null;
	private int size;
	
	Search_And_Delete_nthEl(){
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
	public void add(int data) {
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
	
	
	public node delN(node head,int n) {
	
		if(head.next==null) {
			return null;
		}
		int size=0;
		node prev=head;
		while(prev!=null) {
			prev=prev.next;
			size++;
		}
		
		if(n==size) {
			return head.next;
		}
		int indexToSearch=size-n;
		prev=head;
		int i=1;
		while(i<=indexToSearch) {
			prev=prev.next;
			i++;
		}
		prev.next=prev.next.next;
		return head;
		
	}


	
	public int getSize() {
		return size;
	}
	public static void main(String[] args) {
		
		Search_And_Delete_nthEl  list=new Search_And_Delete_nthEl ();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.head=list.delN(list.head,3);
		list.printList();
	}
	

}
