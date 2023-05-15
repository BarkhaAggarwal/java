package Recursion;

import java.util.Scanner;

public class Mazepath_D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//int n = sc.nextInt();
//		countways(n, 0, 0, "");
//		System.out.println();
//		System.out.println(count);
		printPaths(3, 3, "");
	}
	static int count =0;
	
	public static void printPaths(int n1, int n2, String path) {
	    if (n1 == 1 && n2 == 1) {  // base case: reached bottom-right corner
	        System.out.println(path);
	    } else {
	        if (n1 > 1) {
	            printPaths(n1-1, n2, path + "V");  // move down
	        }
	        if (n2 > 1) {
	            printPaths(n1, n2-1, path + "H");  // move right
	        }
	        if (n1 > 1 && n2 > 1) {
	            printPaths(n1-1, n2-1, path + "D");  // move diagonally
	        }
	    }
	}
	public static void countways(int n ,int i, int j , String path ) {
		
		
		if(i==n-1 && j==n-1) {
			System.out.print(path+" ");
			count++;
			return;
			
		}
		
		
		int c =0;
		
		if(j<n-1) {
			 countways(n, i, j+1, path+"H"); //right --> HORIZONTAL
		}
		
		if(i<n-1) {
		 countways(n, i+1, j, path+"V"); //down -> vertical
		}
		
		 if (i == j || i + j == n - 1) {
		        if (i < n - 1 && j < n - 1) {
		            countways(n, i + 1, j + 1, path+"D");
		        }
	}
	}
}
