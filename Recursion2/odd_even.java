package Recursion2;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
	
		odd(x);
		even(1 , x);
	}

	public static void odd(int n ) {
		if(n ==0) {
			return;
		}
		
		if(n%2!=0) {
			System.out.println(n);
			
		}
		odd(n-1);
	}
	
	public static void even(int i , int n ) {
		if(n==i) {
			return;
		}
		
		if(i%2==0) {
			System.out.println(i);
			
		}
		even(i+1 , n);
	}
}
