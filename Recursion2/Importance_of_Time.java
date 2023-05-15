package Recursion2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Importance_of_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int a[]= new int[n];
		int b[]= new int[n];
		for(int i =0 ; i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i =0 ; i<n;i++) {
			b[i] = sc.nextInt();
		}
		
				System.out.println(solve(a, b, 5));
				
	}

	
	public static int solve(int cal[], int idl[] , int n ) {
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<n;i++) {
			q.offer(cal[i]);
		}
		
		int t =0;
		int id =0;
	
		
		for(int i=0;i<n;i++) {
			while(q.peek()!= idl[i]) {
				q.offer(q.poll());
				t++;
			}
			q.poll();
			t++;
		}
		return t;
	}
}
