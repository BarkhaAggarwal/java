package String;

import java.util.Scanner;

public class Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		System.out.println(good_st(s));
		
	}
	
	public static boolean isVowel(char c) {
	    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	
	public static int good_st(String s) {
	
		int start =0;
		int end =0;
		int max_len =0;
		
		
		while(end<s.length()) {
			if(isVowel(s.charAt(end))) {
				end++;
			}
			else {
				
				max_len = Math.max(max_len, end - start);
	            while (start < end && !isVowel(s.charAt(start))) {
	                start++;
	            }
	            start++;
	            end++;
	        }
		}
			max_len = Math.max(max_len, end - start);
	    return max_len;
			
	}
	

}
