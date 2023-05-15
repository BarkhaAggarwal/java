package Recursion2;

import java.util.Scanner;

public class pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
pattern(x, 5);
	}
	public static void star(int n) {
		if (n==0) {
			return;
		}
		System.out.print("*\t");
		star(n-1);
		
	}
	
	public static void pattern(int r , int i) {
		if(r==0) {
			return;
		}
		star(i);
		System.out.println();
		
		pattern(r-1, i-1);
		
	}

}
