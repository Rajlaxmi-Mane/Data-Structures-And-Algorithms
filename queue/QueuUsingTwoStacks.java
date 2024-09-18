package com.queue;

import java.util.Stack;

public class QueuUsingTwoStacks {

	public static class Queuen {
		static Stack s1 = new Stack();
		static Stack s2 = new Stack();

		public static  boolean isEmpty() {
			return s1.isEmpty();
		}

		public static void add(int data) {
			if (s1.isEmpty()) {
				s1.push(data);
				return;
			}
			while (!s1.isEmpty()) {

				s2.push(s1.pop());
			}
			s1.push(data);
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}

		public static int remove() {
			if (s1.isEmpty()) {
				return -1;
			}
			return (int) s1.pop();
		}

		public static int top() {
			if (s1.isEmpty()) {
				return -1;
			}
			return (int) s1.peek();
		}

	}

	public static void main(String[] args) {
		Queuen q = new Queuen();
		q.add(10);
		q.add(30);
		q.add(40);
		q.add(50);
		
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}

}
