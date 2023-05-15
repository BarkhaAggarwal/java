package Recursion2;

import java.util.Scanner;

public class RecursionDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		dup(s, 1, "");
	}
	
	public static void dup(String s , int i , String ans) {
		if(i == s.length()) {
			System.out.println(ans+s.charAt(s.length()-1));
			return ;
		}
		
		if(s.charAt(i) == s.charAt(i-1)) {
			ans = ans + s.charAt(i-1) +"*";
		}
		else {
			ans = ans+s.charAt(i-1);
		}
		i++;
		dup(s,i,ans);
		
		
		
	}

}
