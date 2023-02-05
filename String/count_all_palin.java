package String;

import java.util.Scanner;

public class count_all_palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int len = st.length();
		countAllPalindrome(st,len);
		

	}

	public static boolean pallindrome(String s1) {
		
		
		int s =0;
		int e = s1.length()-1;
		while(s<e) {
			if(s1.charAt(s)==s1.charAt(e)) {
				s++;
				e--;
			}
			else {
				return false;
			}
			
		}
		
		return true;	
		}
	
	public static void countAllPalindrome(String ss , int len) {
		int count =0;
		for(int s =0;s<len;s++) {
			for(int e = s+1;e<=len;e++) {
				String s1 = ss.substring(s, e);
				if(pallindrome(s1)) {
					if(s1.length()>=2) {
						System.out.println(s1);
						count++;
						
					}
				
				
				}
			}
		}
		
		System.out.println(count);
		
	}
	
	
}
