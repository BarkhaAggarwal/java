package BinaryTree;

import BinaryTree.Left_view.Node;

public class lca {
	class Node{
		int data;
		Node left;
		Node right;
	}
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Node lca(Node root, int n1, int n2) {
		
		if(root==null) return null;
		if(root.data ==n1 || root.data==n2) return root;
		
		Node left = lca(root.left, n1, n2);
		Node right = lca(root.right, n1, n2);
		
		if(left == null) return right;
		if(right== null) return left;
		return root;
		
	}
	 public Node lowestCommonAncestor( Node root, Node p, Node q) {
         if (root == null || root == p || root == q) return root;
    Node left = lowestCommonAncestor(root.left, p, q);
    Node right = lowestCommonAncestor(root.right, p, q);
    return left == null ? right : right == null ? left : root;
        
    }
}
