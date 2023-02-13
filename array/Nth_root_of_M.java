package array;

import java.util.Scanner;

public class Nth_root_of_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       int t = sc.nextInt();
	       int n ,m;
			for(int j =0;j<t ;j++) {
			  n = sc.nextInt();
				m = sc.nextInt();
				root(n ,m);
				}
	}
	
	public static void root(int n , int m) {
		int ans = 1;
		for(int i =1;i<=m/2 ;i++) {
			for(int j = 1 ; j<=n ; j++ ) {
				ans *= i ;
			}
			if(ans== m) {
				System.out.println(ans);
				break;
			}
		}
	}

}
