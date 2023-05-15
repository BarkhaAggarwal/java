package Stack;

import java.util.Stack;

import String.rev_str;

public class stack_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<>();
		Stack<Integer> s1 = new Stack<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		copy(s, s1);
		System.out.println(s1);
		
		
//		System.out.println(s);
//		System.out.println(s.pop());
//		System.out.println(s);
		//print(s);
		rec_2(s);
		//rec(s);
		
	
	}

	public static void print(Stack <Integer> s) {
		
		Stack<Integer> s1 = new Stack<>();
		while(!s.isEmpty()) {
			int ali = s.pop();
			s1.add(ali);
			
		}
		System.out.println(s1);
		}
		
		public static void rec(Stack <Integer> s) {
			
			if(s.isEmpty()) {
				return;
			}
			int ali = s.pop();
			System.out.println(ali);
			rec(s);
			s.add(ali);
			
			
		}
public static void rec_2(Stack <Integer> s) {
			
			if(s.isEmpty()) {
				return;
			}
			int ali = s.pop();
			
			rec(s);
			s.add(ali);
			System.out.println(ali);
			//s.add(ali);
			
			
		}

		public static void print2(Stack <Integer> s) {
			
			Stack<Integer> s1 = new Stack<>();
			while(!s.isEmpty()) {
				int ali = s.pop();
				s1.add(ali);
				
			}
			System.out.println(s1);
			}
		
		
		
		public static void copy(Stack <Integer> s, Stack<Integer> s1) {
			//Stack<Integer> s1 = new Stack<>();
			if(s.isEmpty()) {
				return;
			}
			int ali = s.pop();
			
			
			copy(s, s1);
			s1.add(ali);	
			
		}
		
		public static void revv(Stack <Integer> s) {
			
		}
		
		
	
}
