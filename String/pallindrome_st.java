package String;

import java.util.Scanner;

public class pallindrome_st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int len = st.length();
		System.out.println(palin(st,len));
		
	}
	
	public static boolean palin(String s, int len) {
		int st=0;
		int end = len-1;
		while(st<=end) {
			if(s.charAt(st)==s.charAt(end)) {
				st++;
				end--;
			}
			else {
				return false;
			}
		}
		return true;
		
		
	}

}
