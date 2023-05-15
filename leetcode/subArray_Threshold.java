package leetcode;

import lecture1.reverseDigit;

public class subArray_Threshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]  s = {'h', 'e', 'l', 'l', 'o'};
		reverseString(s);
		
		

	}
	
//	 public int validSubarraySize(int[] nums, int threshold) {
//	        int n = nums.length;
//	        int dem = threshold/ n;
//	        
//	    }
	
	  public static void reverseString(char[] s) {
	        
	        int s1 =0 ;
	        int e = s.length-1;
	        
	        while(s1<=e) {
	        	
	        	char temp = s[s1];
	        	s[s1] = s[e];
	        	s[e] = temp;
	        	
	        	s1++;
	        	e--;
	        }
	        //ArrayList<Character> al = new ArrayList<>();
	        
//	        for(char ss : s) {
	        System.out.println(s);
//	        }

	    }

}
