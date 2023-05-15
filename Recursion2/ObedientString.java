package Recursion2;

import java.util.Scanner;

import String.rev_str;

public class ObedientString {

	static boolean ans = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String a = sc.nextLine();
		check("",a);
		System.out.println(ans);
	
	

	}

	public static void check( String cur, String tocheck) {
		
		if(!tocheck.startsWith(cur)) {
			return;
		}
		
		if(cur.equals(tocheck)) {
			ans = true;
			return;
		}
		
		
		
		if(cur.isEmpty()) {
			check("a", tocheck);
		}
		else if(cur.startsWith("a")) {
			check(cur+"a", tocheck);
			check(cur+"bb", tocheck);
		}
		else if(cur.endsWith("bb")) {
			check(cur+"a", tocheck);
			
		}
		
		
	}

}
