package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class longest_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s = "pwwkew";
 System.out.println(maxl(s));
 int a [] = {1 ,2};
 int b [] = {3 , 4};
System.out.println( findMedianSortedArrays(a,b));
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
       
        double median =0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0 ; i<n ;i++){
            a.add(nums1[i]);
        }

         for(int i =0 ; i<m ;i++){
            a.add(nums2[i]);
        }
         Collections.sort(a);
        int len = a.size();
        if(len%2==0) {
        	median = a.get(len/2) + a.get((len/2) -1);
        	median = median/2;
        }
        else {
        	int l = len/2;
        	median = a.get(l);
        }
         return  median;
        
    }
	
	
	public static int maxl(String s ) {
		int max_len = 0;
		
		if(s.isEmpty()) {
			return 0;
		}
		else if(s.length() == 1) {
			return 1;
		}
		
		String str ="";
		for(char c : s.toCharArray()) {
			String curr = String.valueOf(c);
			if(str.contains(curr)) {
				//System.out.println(str);
				str = str.substring(str.indexOf(c)+1);
				
			}
			
			str = str + String.valueOf(c);
			max_len = Math.max(max_len, str.length());
		}
		//System.out.println(str);
		return max_len;
		
	}
		
	
}
