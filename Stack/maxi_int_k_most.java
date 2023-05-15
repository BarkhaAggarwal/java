package Stack;

import java.util.Scanner;

public class maxi_int_k_most {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(found(n, k));;
		
	}
	
	public static int found(int i , int k ) {
		char[] s = String.valueOf(i).toCharArray();
		findMax(s,k );
		return Integer.parseInt(String.valueOf(s));
	}
	
	
	public static void findMax(char[]s, int k) {
		if (k == 0) {
            return;
        }
		
		int n = s.length;
		
		for(int i =0;i<n-1;i++) {
			char maxDigit = s[i];
            int maxIndex = i;
			
            for(int j = i+1 ;j<n;j++) {
            	if(maxDigit<s[j]) {
            		maxDigit = s[j];
            		maxIndex = j;
            	}
            	
            	if(maxDigit>s[i]) {
            		char temp = s[i];
            		s[i] = s[maxIndex];
            		 s[maxIndex] = temp;
            		 k--;
            	}
            	if (k == 0) {
                    return;
                }
            	
            }
            
		}
	}

}
