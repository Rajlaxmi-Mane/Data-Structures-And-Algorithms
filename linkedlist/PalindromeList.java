package com.linkedlist;

public class PalindromeList {
	node head = null;
	private int size;

	PalindromeList() {
		this.size = 0;
	}

	// linked list is created

	class node {
		int data;
		node next;

		node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	public void add(int data) {
		node newNode = new node(data);
		if (head == null) {
			newNode.next = head;
			head = newNode;
			return;
		}

		node curNode = head;
		while (curNode.next != null) {
			curNode = curNode.next;
		}
		curNode.next = newNode;
	}

	// print list

	public void printList() {
		node curNode = head;

		if (head == null) {
			System.out.println("list is empty...");
		}

		while (curNode != null) {
			System.out.print(curNode.data + "->");
			curNode = curNode.next;
		}
		System.out.println("null");

	}

	public boolean palindrom(node head) {
		if(head==null || head.next==null) {
			return true;
		}
		
		node midNode=findMid(head);
		
		node secHalfStart=reverse(midNode.next);
		node firstHalfStart=head;
		
		while(secHalfStart!=null) {
			if(firstHalfStart!=secHalfStart) {
				return false;
			}
			firstHalfStart=firstHalfStart.next;
			secHalfStart=secHalfStart.next;
		}
		
		return true;
		
	}
	
	public node reverse(node head) {
		node prev=null;
		node cur=head;
		if(head==null || head.next==null) {
			return head;
		}
		while(cur!=null) {
			node next=cur.next;
			cur.next.next=cur;
			
			prev=cur;
			cur=next;
		}
		head.next=null;
		return prev;
	}
	
	public node findMid(node head) {
		node hare=head;
		node turtle=head;
		
		while(hare.next!=null && hare.next.next==null) {
			hare=hare.next.next;
			turtle=turtle.next;
		}
		return turtle;
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {

		PalindromeList list = new PalindromeList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		
		boolean flag=list.palindrom(list.head);
		System.out.println("hhhhh");
	}

}
