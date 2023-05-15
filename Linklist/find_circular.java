package Linklist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

import Linklist.linkedlist.Node;

public class find_circular {
	public static class Node{
		int data;
		Node next;
		
		Node(int data) {
	        this.data = data;
	        next = null;
	    }

		
	}


	  static Node head;

	 public Node removeElements(Node head, int val) {
		
		 Node cur = head;
		
		  while (head != null && head.data == val) {
		        head = head.next;
		    }
		  Node prev = null;
		 while(cur!=null) {
			 if(cur.data == val) {
				 prev.next = cur.next;
				  }
			 else {
				 prev = cur;
			 }
			 cur = cur.next;
			  }
	return head;
		
	 }
	 
	 
	public int size(Node head) {
		Node temp = head;
		int c =0;
	    
		while(temp!= null) {
			c++;
			temp = temp.next;
		}
		return c;
			
		}
	
	public void add(int data) {
	    Node newNode = new Node(data);
	    if (head == null) {
	        head = newNode;
	    } else {
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }
	}
	public int size() {
		Node temp = head;
		int c =0;
	    
		while(temp!= null) {
			//System.out.println(temp.data+" ");
			c++;
			temp = temp.next;
		}
		return c;
			
		}
	public void display() {
		Node temp = head;
		
		while(temp!= null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
	private Node getNodeAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}
	public void createCycle() {
		for(int i =1;i<=9;i++) {
			this.add(i);
		}
		Node last = this.getNodeAt(size()-1);
		Node middle = this.getNodeAt(3);
		last.next = middle;
	}

	
	public Node detectCycleNode() {
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null ) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow== fast) {
				return slow;
			}
		}
		return slow;
		
	}
	public boolean detectCycle() {
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null ) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow== fast) {
				return true;
			}
		}
		return false;
		
	}
	public void removeCycle() {
		Node s1 = head;
		Node s2 =detectCycleNode();
		while(s1.next!=s2.next) {
			s1 = s1.next;
			s2 = s2.next;
		}
		
		s2.next = null;
	}
	
	public void countCycleElement() {
		int c =1;
		Node s1 =detectCycleNode();
		Node s2 =s1.next;
		while(s1!=s2) {
			s2 = s2.next;
			c = c+1;
		}
		System.out.println(c);
		
	}
	  public Node removeNthFromEnd(Node head, int n) {
		  
		  Node dummy = new Node(0);
			    dummy.next = head;
			    Node first = dummy;
			    Node second = dummy;
			    
			    // Move the second pointer n steps forward
			    for (int i = 1; i <= n + 1; i++) {
			        second = second.next;
			    }
			    
			    // Move both pointers until the second pointer reaches the end
			    while (second != null) {
			        first = first.next;
			        second = second.next;
			    }
			    
			    // Remove the nth node from the end
			    first.next = first.next.next;
			    
			    return dummy.next;
			

	    }
	  public Node swapPairs(Node head) {
		  Node dummy = new Node(0);
	        dummy.next = head;
	        Node cur = dummy;
	        while(cur.next!= null && cur.next.next!= null ){
	        	Node f = cur.next;
	        	Node s = cur.next.next;
	                f.next = s.next;
	                cur.next = s;
	                s.next = f;
	                cur = cur.next.next;
	               }
	               return dummy.next;
	    }
	  public Node rotateRight(Node head, int k) {
	        if (head == null || k == 0) {
	        return head;
	    }
	    int len =1;
	    Node tail = head;
	        while(tail.next!=null){
	            len++;
	            tail = tail.next;
	        }
	          k = k % len;
	        if(k ==0 ){
	            return head;
	        }
	        Node ntail = head;
	        for(int i =1 ;i<len-k ; i++){
	        ntail = ntail.next;
	        }
	        Node nhead = ntail.next;
	  ntail.next = null;
	  tail.next = head;
	return nhead;
	        
	    }
   
	  public Node partition(Node head, int x) {
	        Node GTHead = new Node(0);
	        Node GTTail = GTHead;
	        Node LTHead = new Node(0);
	        Node LTTail = LTHead;
	      
	      while(head!= null){
	          if(head.data<x){
	             LTTail.next = head;
	             LTTail = LTTail.next;
	          }
	          else{
	             GTTail.next = head;
	             GTTail = GTTail.next;
	          }
	          head = head.next;
	           }
	       GTTail.next = null;
	       LTTail.next = GTHead.next;

	   return LTHead.next;

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linkedlist l = new linkedlist();
		find_circular l = new find_circular();
		//LinkedList<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(6);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		//l.deleteDuplicates();
		l.removeElements(head, 6);
		l.display();
//		l.removeAll(Collections.singleton(6));
//		System.out.println(l);
		//l.display();
		
		//l.createCycle();
		//l.removeCycle();
		//l.display();
	//l.countCycleElement();
		
		//System.out.println(l.detectCycle());
		}
}
