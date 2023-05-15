package Recursion2;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(pow(x, n));;

	}
	public static int pow(int x , int n) {
		int temp ; //log(n) -->complexity
		if(n==0) {
			return 1;
		}
		 if(n ==1) {
			return x;
		}
		 if(x == 0) {
			return 0;
		}
		 temp = pow(x , n/2);
		if(n%2==0) {
			
			return temp * temp;
		}
		else {
			return x * temp * temp;
		}
		
		
	}
	
}
