package Recursion2;

import java.util.Scanner;

public class Generate_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int a[]= new int[n];
		int b[]= new int[m];
		for(int i =0 ; i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i =0 ; i<m;i++) {
			b[i] = sc.nextInt();
		}
		
		solve("", 0, a, 0, b, true, Integer.MIN_VALUE);
		
	}
	public static void solve(String path, int idxA, int[] A, 
			int idxB, int[] B, boolean turnA, int prev) {
		if (turnA) {
			if (!path.isEmpty()) {
				System.out.println(path);
			}
			for (int i = idxA; i < A.length; i++) {
				if (A[i] > prev) {
					solve(path + A[i] + " ", i + 1, A, idxB, B, false, A[i]);
				}
			}
		} else {
			for (int i = idxB; i < B.length; i++) {
				if (B[i] > prev) {
//				System.out.println(path+B[i]);
					solve(path + B[i] + " ", idxA, A, i + 1, B, true, B[i]);
				}
			}
		}
	}
	
	

}
