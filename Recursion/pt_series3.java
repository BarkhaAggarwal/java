package Recursion;

import java.util.ArrayList;

public class pt_series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patt(4);
	}
	
	public static void patt(int n) {
		
		if(n==0) {
			return;
		}
//		ArrayList<Integer> a = new ArrayList<>();
//		
//		a.add(n);
//		System.out.println(a);
//		patt(n-1);
//		System.out.println(a);
		
System.out.println(n);
		
		patt(n-1);
		System.out.println(n);
		
	}

}
