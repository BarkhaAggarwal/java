package String;

import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		anagrampalindrome(s1);	

	}
	
	public static void anagrampalindrome(String str ) {
		 int[] frequency = new int[256]; // assuming ASCII characters
	        int oddCount = 0;
		
	        for (int i = 0; i < str.length(); i++) {
	            frequency[str.charAt(i)]++;
	        }
	        
	        for (int i = 0; i < frequency.length; i++) {
	            if (frequency[i] % 2 != 0) {
	                oddCount++;
	            }
	        }
	        
	        if (str.length() % 2 == 0 && oddCount == 0) {
	           System.out.println("Yes");
	        } else if (str.length() % 2 != 0 && oddCount == 1) {
	        	  System.out.println("Yes");
	        } else {
	        	  System.out.println("No");
	        }
	}
	

}
