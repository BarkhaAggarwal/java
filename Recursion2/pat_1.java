package Recursion2;

import java.util.Scanner;

public class pat_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
         pat(r, 1);
	}
	public static void star(int n) {
		if(n==0) {
			return;
		}
		
		
	System.out.print("*\t");
		star(n-1);
	}
	
	public static void pat(int r , int n) {
		if(r==0) {
			return;
		}
		
		star(n);
		
		System.out.println();
		
		pat(r-1, n+1);
	}

}
