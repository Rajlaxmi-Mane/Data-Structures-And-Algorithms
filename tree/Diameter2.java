package com.tree;


public class Diameter2 {
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
		
		static class treeInfo{
			int height,dia;
			treeInfo(int height,int dia){
				this.height=height;
				this.dia=dia;
			}
		}
		
		public static treeInfo dia(Node root) {
			if(root==null) {
				return new treeInfo(0,0);
			}
			treeInfo left=dia(root.left);
			treeInfo right=dia(root.right);
			
			int myheight=Math.max(left.height, right.height)+1;
			
			int dia1=left.dia;
			int dia2=right.dia;
			int dia3=left.height+right.height+1;
			
			int myDia=Math.max(Math.max(dia1,dia2),dia3);
			treeInfo myInfo=new treeInfo(myheight,myDia);
			return myInfo;
			
		}
	}
	
public static void main(String[] args) {
	BinaryTree tree=new BinaryTree();
	int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
	Node root=tree.buildTree(nodes);
	System.out.println(root.data);
	System.out.println(tree.dia(root).dia);
	
}
}
