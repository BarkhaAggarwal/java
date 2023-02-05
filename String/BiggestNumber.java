package String;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int n  ;
		int arr[];
		
		
		for(int i = 0;i<t ; i++) {
			n = sc.nextInt();
			 arr = new int[n];
			
			
			for(int j = 0;j<n;j++) {
				arr[j]= sc.nextInt();
			}
			form_big_Num(arr, n);
		}
		
		
	}
	
	public static long  compare(int a , int b ) {
		
		String s1 = Integer.toString(a);
		String s2 =Integer.toString(b);
		
	    String a1 = s1+s2;
	    String a2 = s2+s1;
	    
	    long b1 = Integer.parseInt(a1);
	    long b2 = Integer.parseInt(a2);
	    
	    
	    if(b1>b2) {
	    	return b1;
	    }
	    else {
	    	return b2;
	    }
	    
	}
	
	public static void form_big_Num(int a[], int n) {
		
		long res = 0 ;
		for(int i =0;i<n-1;i=i+2) {
			 res = compare(a[i],a[i+1]);
		}
		
		System.out.println(res);
	}
	
	

}
