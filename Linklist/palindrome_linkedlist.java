package Linklist;


import Linklist.linkedlist.Node;
import lecture1.reverseDigit;

public class palindrome_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist ll = new linkedlist();
		 Node head = new Node(1);
	        head.next = new Node(2);
	        head.next.next = new Node(3);
//	        head.next.next.next = new Node(2);
//	       head.next.next.next.next = new Node(1);

	       
	        Node middle = mid(head);
	        Node revv =rev(middle) ;

//printList(revv);
//System.out.println();
//printList(head);
//System.out.println();
	        
	        Node l1 = revv;
	        Node l2 = head;
	        boolean isEqual = compare(l1, l2);
	        System.out.println(isEqual);
	        
	        //reverse(head);
	       
		
	}
	//static Node head;
public static Node mid(Node head) {
		
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

public static Node rev (Node head) {
	Node cur = head;
	Node prev = null;
	Node after = null;
	
	while(cur!=null) {
		after = cur.next;
		cur.next = prev;
		prev = cur;
		cur = after;
	}
	
	return prev;
}
public static boolean compare(Node l1, Node l2) {
	Node curr1 = l1;
	Node curr2 = l2;
	
	while(curr1!= null &&  curr2!= null) {
		if(curr1.data != curr2.data) {
			return false;
		}
		curr1 = curr1.next;
        curr2 = curr2.next;
	}
	
	
	return curr1 == null && curr2 == null;
	
}
public static void reverse(Node head) {
	if(head==null) {
		return;
	}
	reverse(head.next);
	System.out.println(head.data);
	
}
public static void printList(Node head) {
    Node curr = head;
    while (curr != null) {
        System.out.print(curr.data + " ");
        curr = curr.next;
    }
}

}
