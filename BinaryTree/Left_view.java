package BinaryTree;

import java.util.ArrayList;

import BinaryTree.level_order_treversal.Node;

public class Left_view {

	class Node{
		int data;
		Node left;
		Node right;
	}
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void printleftview(Node root , int level, ArrayList l) { //pre order
		if(root==null) return;
		if(l.get(level)==null) {
			l.add(root);

		}
		printleftview(root.left, level+1, l);
		printleftview(root.right, level+1, l);
		
		
	}
	
	public static void printrightview(Node root , int level, ArrayList l) { //pre order
		if(root==null) return;
		if(l.get(level)==null) {
			l.add(root);

		}
		
		//l.set(level, root); //updating if we call left first then right
		printrightview(root.right, level+1, l);
		printrightview(root.left, level+1, l);
		
		
	}
	
	public static void print(Node root) {
		ArrayList<Node> li= new ArrayList<>();
		
		printleftview(root, 0, li);
		for(Node cur: li) {
			System.out.println(cur.data+" ");
		}
		
	}

}
