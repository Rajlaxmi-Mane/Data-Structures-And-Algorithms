package com.tree;

import java.util.*;

import com.queue.QueueUsingLinkedList.Queue;

public class PostORder {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		static int index = -1;

		public static Node buildTree(int nodes[]) {
			index++;
			if (nodes[index] == -1) {
				return null;
			}
			Node newn = new Node(nodes[index]);

			newn.left = buildTree(nodes);
			newn.right = buildTree(nodes);
			return newn;
		}
	}

	public static void preorder(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void inorder(Node root) {
		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);

	}

	public static void postorder(Node root) {
		if (root == null) {
			return;
		}

		postorder(root.left);

		postorder(root.right);
		System.out.print(root.data + " ");

	}

	public static void levelOrder(Node root) {
		Deque<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);

		while (!q.isEmpty()) {
			Node cc = q.remove();

			if (cc == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				System.out.print(cc.data + " ");
				if (cc.left != null) {
					q.add(cc.left);
				}
				if (cc.right != null) {
					q.add(cc.right);
				}
			}
		}

	}

	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println("preorder");
		preorder(root);
		System.out.println("\n\ninorder");
		inorder(root);
		System.out.println("\n\npostorder");
		postorder(root);
		System.out.println("\n\nlevelorder");
		levelOrder(root);

	}
}
