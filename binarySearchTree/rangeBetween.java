package com.binarySearchTree;

public class rangeBetween {
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
		
		public static void rangeIn(Node root,int x,int y) {
			
			if(root==null) {
				return;
			}
			if(root.data>=x && root.data<=y) {
				rangeIn(root.left,x,y);
				System.out.print(root.data+" ");
				rangeIn(root.right,x,y);
			}
			
			else if(root.data>=y) {
				rangeIn(root.left,x,y);
			}
			else{
				rangeIn(root.right,x,y);
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
		
		rangeIn(root,2,5);


	}
}
}
