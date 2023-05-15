package Dynamic_programming;

import java.util.Scanner;

public class CountNo_BinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n =  sc.nextInt();
			System.out.println(solve(n));
			
		}

	}
	
	public static int solve(int n) {
		int dp[][]= new int[n+1][2];
		dp[1][0]= 1;
		dp[1][1]= 1;
		
		
		for(int i=2;i<=n;i++) {
			dp[i][0] = dp[i-1][0] + dp[i-1][1];
			dp[i][1] = dp[i-1][0];
			
		}
		return dp[n][0] + dp[n][1];
	}
	
}
