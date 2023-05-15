package Linklist;

import Linklist.find_circular.Node;

public class reverse_list_2 {

	public static class ListNode{
		public int data;
		public ListNode next;
		
		public ListNode(int data) {
	        this.data = data;
	        next = null;
	    }
}

	  static ListNode head;
	  public static ListNode rev (ListNode head) {
		  ListNode cur = head;
		  ListNode prev = null;
			ListNode after = null;
			
			while(cur!=null) {
				after = cur.next;
				cur.next = prev;
				prev = cur;
				cur = after;
			}
			
			return prev;
		}
	  
	  public ListNode reverseBetween(ListNode head, int left, int right) {
		  if (head == null || left == right) {
		        return head;
		    }
		    
		    ListNode dummy = new ListNode(-1);
		    dummy.next = head;
		    ListNode prev = dummy;
		    
		    // Move prev to the node before the left position
		    for (int i = 1; i < left; i++) {
		        prev = prev.next;
		    }
		    
		    ListNode curr = prev.next;
		    
		    // Reverse the nodes from left to right
		    for (int i = left; i < right; i++) {
		        ListNode next = curr.next;
		        curr.next = next.next;
		        next.next = prev.next;
		        prev.next = next;
		    }
		    
		    return dummy.next;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
