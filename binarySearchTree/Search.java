package com.binarySearchTree;

public class Search {
	
	public static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public static class tree{
		public static int index=-1;
		
		public static Node getRoot(Node root,int values) {
		if(root==null) {
			root=new Node(values);
			return root;
		}
		if(root.data>values) {
			root.left=getRoot(root.left,values);
		}
		else {
			root.right=getRoot(root.right,values);
		}
		return root;
		}
		
		public static void inorder(Node root) {
			if(root==null) {
				return;
			}
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
		public static boolean search(Node root,int key) {
			if(root==null) {
				return false;
				
			}
			if(root.data==key) {
				return true;
			}
			else if(root.data>key) {
				return search(root.left,key);
			}else {
				return search(root.right,key);
			}
		}
	}
	public static void main(String[] args) {
		int nodes[]= {5,1,3,6,4,2,7};
		Node root=null;
		tree tree = new tree();
		for(int i=0;i<nodes.length;i++) {
		 root=tree.getRoot(root,nodes[i]);
		}
		
		tree.inorder(root);
		System.out.println();
		System.out.println(tree.search(root, 9));
	}

}
