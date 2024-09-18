package com.queue;

public class QueueUsingLinkedList {
	
	static public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	public static class Queue{
		static Node head=null;
		static Node tail=null;
		
		public static  boolean isEmpty() {
			return head==null && tail==null;
		}
		
		public static void add(int data) {
			Node newn=new Node(data);
			if(tail==null) {
				tail=head=newn;
				return;
			}
			tail.next=newn;
			tail=newn;
			
		}
		public static int remove() {
			if(isEmpty()) {
				return -1;
			}
			if(head==tail) {
				tail=null;
			}
			
			int front=head.data;
			head=head.next;
			return front;
		}
		
		public static int peek() {
			return head.data;
		}
		
	}
	
	
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
