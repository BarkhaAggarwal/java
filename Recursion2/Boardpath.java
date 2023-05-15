package Recursion2;

import java.util.Scanner;

public class Boardpath {
static int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		solve(n, m, "");
		System.out.println();
		System.out.println(c);
	}
	
	public static void  solve(int n , int m , String path) {
		
		if(n==0) {
			System.out.print(path+" ");
			c++;
			return;
		}
		
		for(int i=1;i<=m && n-i>=0 ;i++) {
		   solve(n-i, m, path+i);
		}
	}

}
