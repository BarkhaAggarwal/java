package Recursion2;

import java.util.Scanner;

public class nth_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int a []= new int [n];
		for(int i =0;i<n;i++) {
			a[i] = sc.nextInt();
		}
    //triangle(1, n);
	
	}
	static int ans = 0;
	public static void triangle(int i , int n ) {
		if(i> n ) {
		System.out.println(ans); 
		return;
		}
		
		if(i<=n) {
			ans = ans + i;
			triangle(i+1, n);
		}
	}
	
public static int last_oc(int a[] ,int f , int i) {
		
		if(i<0) {
			return -1;
			}
		
		if(a[i]==f) {
			return i;
		}
		 int s = last_oc(a , f , i-1);
		 
		
		return s;
	}


}
