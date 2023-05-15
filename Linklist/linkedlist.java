package Linklist;

import java.util.Stack;

import Linklist.linkedlist.Node;

public class linkedlist {
public static class Node{
	int data;
	Node next;
	
	Node(int data) {
        this.data = data;
        next = null;
    }

	
}


Node head;
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
public void display() {
	Node temp = head;
	
	while(temp!= null) {
		System.out.println(temp.data+" ");
		temp = temp.next;
	}
}
	
public int getfirst() {

	if(isEmpty()) {
		throw new NullPointerException("stopppp");
	}
	return head.data;
		
	}
private boolean isEmpty() {
	// TODO Auto-generated method stub
	return head==null;
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

public int getlast() {
	Node temp = head;
	
	while(temp.next!= null) {
		//System.out.println(temp.data+" ");
		temp = temp.next;
	}
	
	//System.out.println(temp.data+" ");
	return temp.data;
}

public int getindex(int idx) {
	Node temp = head;
	
	
		//System.out.println(temp.data+" ");
		for(int i=0;i<idx;i++) {
			temp = temp.next;
		}
	return temp.data;
	}

private Node getNode(int idx) {
	Node temp = head;
	
		for(int i=1;i<=idx;i++) {
			temp = temp.next;
		}
	return temp;
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

public void addlast(int ali) {
	Node last = getNode(size()-1);
	last.next = new Node(ali);
}
public void addfirst(int ali) {
	
	Node nn =new Node(ali);
	nn.next =head;
	head = nn;
	
	
}

public int rem_first() {
	Node temp = head;
	int ans = temp.data;
	head = head.next;
	return ans;
	
	}
public void rem_last() {
	Node temp = head;
	while(temp.next!= null) {
		//System.out.println(temp.data+" ");
		temp = temp.next;
	}
 temp = null;
	}

public int remlast() {
	Node sec = getNode(size()-2);
	Node last = sec.next;
	sec.next = null;
	return last.data;
	
}

public void rematidx(int idx) {
	Node prev = getNode(idx-1);
	Node curr = prev.next;
	Node after = curr.next;
	//prev.next
	
	}

public void K_Rev(int k) {
	Node nHead = null;
	Node nTail = null;
	Node temp = head;
	Stack<Node> S = new Stack<>();
	while (temp != null) {
		Node After = temp.next;
		S.add(temp);
		if (S.size() == k) {

			while (!S.isEmpty()) {
				Node toAdd = S.pop();
				if (nHead == null) {
					nHead = toAdd;
					nTail = toAdd;
				} else {
					nTail.next = toAdd;
					nTail = toAdd;
				}
			}

		}
		temp = After;
	}
	while (!S.isEmpty()) {
		Node toAdd = S.pop();
		if (nHead == null) {
			nHead = toAdd;
			nTail = toAdd;
		} else {
			nTail.next = toAdd;
			nTail = toAdd;
		}
	}
	nTail.next = null;
	head = nHead;
}

public void createCycle() {
	for(int i =1;i<=9;i++) {
		this.add(i);
	}
	Node last = this.getNodeAt(size()-1);
	Node middle = this.getNodeAt(3);
	last.next = middle;
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

}
	

