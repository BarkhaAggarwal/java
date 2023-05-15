package Recursion2;

import java.util.Scanner;

public class AsciiSubsequences {
	static int c =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		find_sub(s, "", 0);
		System.out.println();
		System.out.println(c);

	}

	public static void find_sub(String s , String res, int i) {
		if(i==s.length()) {
//			if(res.length()>0) {
				System.out.print(res+" ");
				c++;
				
			//}
			return; 
		}
		
		char ch = s.charAt(i);
		find_sub(s, res, i+1);
		find_sub(s, res+ch, i+1);
		find_sub(s, res+(int)ch, i+1);
	}
}
