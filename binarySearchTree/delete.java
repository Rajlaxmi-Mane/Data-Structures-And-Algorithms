package com.binarySearchTree;

public class delete {
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
		
		public static Node delete(Node root,int key) {
			if( root==null) {
				return null;
			}
			
			if(root.data>key) {
				root.left=delete(root.left,key);
			}
			else if(root.data<key) {
				root.right=delete(root.right,key);
			}
			else {
				// case 1: node dont have any node
			
			if(root.left==null && root.right==null) {
				return null;
			}
			
//			case 2 : have only one child
			if(root.left==null) {
				return root.right;
			}else if(root.right==null){
				return root.left;
			}
			
			
			// case3 : have two childs
			
			Node is=inorderSuccessor(root.right);
			root.data=is.data;
			delete(root.right,is.data);
			}
		return root;	
	}
	
	
	public static Node inorderSuccessor(Node root) {
		while(root.left!=null) {
			root=root.left;
		}
		return root;
		
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
		tree.delete(root,4);
		tree.inorder(root);
		System.out.println();
		tree.delete(root, 7);
		tree.delete(root, 3);
		tree.inorder(root);

	}
}
}