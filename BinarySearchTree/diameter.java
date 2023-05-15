package BinarySearchTree;

import BinarySearchTree.validBst.TreeNode;

public class diameter {
	public  class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	          this.left = left;
	         this.right = right;
	     }


	
}
	public int diameterOfBinaryTree(TreeNode root) {
		int diameter[] = new int[1];

        // Recursively calculate the height of the tree and update the diameter array
        height(root,diameter);

        // Return the diameter of the tree
      return diameter[0];
	}
 public int height(TreeNode root , int dia[]) {
	 if(root == null) {
		 return 0;
	 }
	 
	 int left = height(root.left, dia);
	 int right = height(root.right, dia);
	 
	 dia[0] = Math.max(dia[0], left+right);
	return Math.max(left, right)+1;
		 
	 }
}
