package Recursion2;

import java.util.Scanner;

public class count_ways_nth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(countWays(n));

	}
public static int fact(int n) {
		
		if(n==0) {
			return 1;
			}
		int sp = fact(n-1);
		return sp*n;
		
}
	public static  int countWays(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else if (n == 2) {
	        return 2;
	    } else {
	    	//return countWays(n-1) + countWays(n-2);
	       //return (countWays(n-1) + countWays(n-2))/2;
	    	int ways = countWays(n-1) + countWays(n-2);
	        int n1 = n/2; // number of 1-steps
	        int n2 = n%2; // number of 2-steps
	        int perms = fact(n1+n2) / (fact(n1) * fact(n2));
	        return ways / perms;
	    }
	}

}
