package Recursion2;

import java.util.Scanner;

public class Count_Occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		char s1 = sc.next().charAt(0);
		count(s,s1);
		

	}
	public static void count(String s , char a) {
		
		int c =0;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)==a) {
				c++;
			}
			}
		System.out.println(c);
		 
	}

}
