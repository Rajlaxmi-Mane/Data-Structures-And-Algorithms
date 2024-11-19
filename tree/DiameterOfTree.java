package com.tree;

import com.tree.PostORder.Node;

public class DiameterOfTree {
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
		
		public static int height(Node root) {
			if(root==null) {
				return 0;
			}
			int left=height(root.left);
			int right = height(root.right);
			int height=Math.max(left, right)+1;
			return height;
		}
		
		public static int dia(Node root) {
			if(root==null) {
				return 0;
			}
			int dleft=dia(root.left);
			int dright=dia(root.right);
			
			int height=height(root.left)+height(root.right)+1;
			 return height;
			
					
		}
	}
	
public static void main(String[] args) {
	BinaryTree tree=new BinaryTree();
	int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
	Node root=tree.buildTree(nodes);
	System.out.println(root.data);
	System.out.println(tree.dia(root));
	
}
}
