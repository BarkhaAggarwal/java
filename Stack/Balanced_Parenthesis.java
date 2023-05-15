package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		boolean ans = isBalanced(s);
		if(ans ==true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		

	}
	
	public static boolean isBalanced(String str) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0 ;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch=='('|| ch=='['||ch=='{') {
				st.push(ch);
			}
			else if(ch==')' || ch==']'|| ch=='}') {
				if(st.isEmpty()) {
					return false;
				}
				
				char top = st.pop();
				if((ch==')'&& top!='(') || (ch==']' && top!='[')|| (ch=='}' && top!='{')) {
					return false;
				}
			}
		}
		return st.isEmpty();		
	}

}
