package com.tree;

public class CountNodes {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static class BinaryTree{
		static int index=-1;
		public static Node buildTree(int nodes[]) {
			index++;
			if(nodes[index]==-1) {
				return null;
			}
			
			Node newn=new Node(nodes[index]);
			
			newn.left=buildTree(nodes);
			newn.right=buildTree(nodes);
			return newn;
		}
	}
	
	public static int count(Node root) {
		if(root==null) {
			return 0;
		}
		
		int leftCnt=count(root.left);
		int rightCnt=count(root.right);
		
		return leftCnt+rightCnt+1;
	}
	
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(nodes);
		
		System.out.println(root.data);
		System.out.println(count(root));
		
	}

}
