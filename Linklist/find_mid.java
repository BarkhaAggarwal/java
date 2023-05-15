package Linklist;

import Linklist.linkedlist.Node;

public class find_mid {
	class Node{
		int data;
		Node next;
		
	}
	//Node head;
	 public Node getIntersectionNode(Node headA, Node headB) {
		 Node carA = headA;
		 Node carB = headB;

	        while(carA!= carB){
	            carA = carA.next;
	            carB = carB.next;

	            if( carA == carB){
	                return carA;
	            }
	            if(carA ==null){
	                carA = headB;
	            }
	             if(carB ==null){
	                carB = headA;
	            }
	        }
	        return carA;
	 }
	
	public void deleteNode(Node node) {
	    // Copy the value of the next node into the given node
	    node.data = node.next.data;
	    // Delete the next node
	    node.next = node.next.next;
	}
	public Node mid(Node head) {
		
		if (head == null) {
	        return null;
	    }
		
		 Node slow = head;
		 Node fast = head;
		 
		
		
		while(fast!=null && fast.next !=null) {
			  slow = slow.next;
			  fast = fast.next.next;
			
		}
		return slow;
	}


}
