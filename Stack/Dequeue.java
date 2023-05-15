package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Dequeue {
	
	
	private  Stack<Integer> s1 = new Stack<>();
	private Stack<Integer> s2 = new Stack<>();
	
	public  void enqueue(int a) {
		s1.push(a);
	}
	
	public int dequeue() {
		if(s2.empty()) {
			if(s1.empty()) {
				throw new RuntimeException("Queue is empty");
			}
			else {
				while(!s1.empty()) {
					s2.push(s1.pop());
				}
			}
		}
		
		return s2.pop();
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dequeue q = new Dequeue();
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
		    q.enqueue(i);
		}
		
		while(true) {
			try {
				int ele = q.dequeue();
				System.out.print(ele+" ");
			}
			catch (RuntimeException e) {
		       // System.out.println(e.getMessage());
		        break;
				
			}
		}

	}

}
