package leetcode;

import java.util.ArrayList;

public class happyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isHappy(19));;
	}
	 boolean ans = true;
	    public static boolean  isHappy(int n) {
	       // int sum =0;
	       ArrayList <Integer> al = new ArrayList<>();
	       al.add(n);
	        while(n!=1){
	             String s = Integer.toString(n);
	        int sum = 0;
	        for (char c : s.toCharArray()) {
	            int digit = Character.getNumericValue(c);
	            sum += digit * digit;
	        }
	        n = sum;

	            
	             al.add(n);
	}
	   return true;
	   
	    }
}
