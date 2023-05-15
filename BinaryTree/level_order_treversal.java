package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.Btree.Node;

public class level_order_treversal {

	class Node{
		int data;
		Node left;
		Node right;
	}
	Node root;
 public  void level(Node root) {
	Queue<Node> q = new LinkedList<>();
	q.add(root);
	q.add(null);
	
	while(!q.isEmpty()) {
		Node nn = q.poll();
		if(nn==null) {
			if(q.isEmpty()) return;
			q.add(null);
			System.out.println();
			continue;
		}
		System.out.println(nn.data);
		if(nn.left!=null) {
			q.add(nn.left);
		}
		if(nn.right!=null) {
			q.add(nn.right);
		}
	}
	
}
}
