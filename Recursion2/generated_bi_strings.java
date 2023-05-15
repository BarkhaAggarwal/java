package Recursion2;

import java.util.Scanner;

public class generated_bi_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t= sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++) {
			String s = sc.nextLine();
			generateBiStrings(s, "");
		}

	}

	
	private static void generateBiStrings(String str, String cur) {
		
		if(str.length()==0) {
			System.out.print(cur+" ");
			return;
		}
		
		char c = str.charAt(0);
		if(c=='0' || c == '1') {
			generateBiStrings(str.substring(1), cur+c);
		}
		else if(c=='?') {
			generateBiStrings(str.substring(1), cur+'0');
			generateBiStrings(str.substring(1), cur+'1');
		}
		
	}
}
