package Recursion2;

import java.util.Scanner;

public class In_Parenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		int op = s.indexOf('(');
		int cl = s.indexOf(')');
		// TODO Auto-generated method stub
		StringBuilder a = new StringBuilder();
		
		parenthesis(s, a, op+1, cl);
	}
	
	public static void parenthesis(String s , StringBuilder ans , int op , int cl) {
		if(op==cl) {
			System.out.println(ans);
			return;
		}
		
			parenthesis(s, ans.append(s.charAt(op)), op+1, cl);
		}

}
