package BinarySearchTree;

public class validBst {
	public class TreeNode {
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
		      public boolean isValidBST(TreeNode root) {
		          return solve(root , Long.MIN_VALUE , Long.MAX_VALUE);
		       }
		       public boolean solve(TreeNode root, long min , long max) {
		           if(root == null){
		               return true;
		           }
		           if(root.val<=min || root.val>=max ){
		               return false;
		           }
		           boolean left = solve(root.left,min , root.val);
		           boolean right = solve(root.right,root.val ,max);

		           return left && right;
		           
		       }
		       
		       public boolean isBalanced(TreeNode root) {
		           solve(root);
		           return ans;
		      }
		      boolean ans = true;
		       public int solve(TreeNode root) {
		           if(root==null){
		               return 0;
		           }
		           if(ans == false ){
		               return -1;
		           }

		           int lf_height =1 + solve(root.left);
		            int rg_height =1 + solve(root.right);
		            if(Math.abs(lf_height - rg_height)>1){
		                ans = false;
		            }
		          return Math.max(lf_height, rg_height);
		      }
		       
		       public boolean flipEquiv(TreeNode root1, TreeNode root2) {
		    	   if(root1 == root2 && root1 == null){
		    	      return true;
		    	   }
		    	   if(root1 == null || root2 == null){
		    	       return false;
		    	   }
		    	   if(root1.val != root2.val){
		    	       return false;
		    	   }
		    	       boolean no = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
		    	        boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
		    	        return no || flip;
		    	     }
		       
		       public boolean isSameTree(TreeNode p, TreeNode q) {
		           if(p == null && q==null){
		               return true;
		           }
		           if(p==null || q==null){
		               return false;
		           }
		           if(p.val != q.val){
		           return false;
		       }

		          boolean left = isSameTree(p.left, q.left);
		          boolean right = isSameTree(p.right, q.right);

		          return left && right;
		      }
		       public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		    	    if(root ==p){
		    	        return p;
		    	    }
		    	    if(root ==q){
		    	        return q;
		    	    }
		    	    if(root == null){
		    	        return null;
		    	    }
		    	        TreeNode L = lowestCommonAncestor(root.left, p , q);
		    	        TreeNode R = lowestCommonAncestor(root.right, p , q);
		    	        if(L!= null && R!=null){
		    	            return root;
		    	        }
		    	        if(L!= null && R==null){
		    	            return L;
		    	        }
		    	        if(L== null && R!=null){
		    	            return R;
		    	        }
		    	        return null;
		    	    }
		       
		       public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
		           if (root == null || root == p || root == q) return root;
		      TreeNode left = lowestCommonAncestor2(root.left, p, q);
		      TreeNode right = lowestCommonAncestor2(root.right, p, q);
		      return left == null ? right : right == null ? left : root;
		          
		      }

}
