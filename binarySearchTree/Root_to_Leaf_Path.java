package com.binarySearchTree;
import java.util.*;

public class Root_to_Leaf_Path {
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
		
		public static void rootToLeafPath(ArrayList path, Node root) {
			if(root==null) {
				return;

			}
			path.add(root.data);
			
			if(root.left==null && root.right==null) {
				printPath(path);
			}
			
			else {
				rootToLeafPath(path,root.left);
				rootToLeafPath(path,root.right);
				
			}
			path.remove(path.size()-1);
			
		}
		
		public static void printPath(ArrayList path) {
			for(int i=0;i<path.size();i++) {
				System.out.print(path.get(i)+" -> ");
			}
			System.out.println();
			
		}
		

	public static void main(String[] args) {
		int nodes[]= {8,5,3,1,4,6,10,11,14};
		Node root=null;
		tree tree = new tree();
		for(int i=0;i<nodes.length;i++) {
		 root=tree.getRoot(root,nodes[i]);
		}
		
		tree.inorder(root);
		System.out.println();
		ArrayList path = new ArrayList();
		tree.rootToLeafPath(path, root);

	}
}

}
